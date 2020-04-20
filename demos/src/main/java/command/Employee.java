package command;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;

    private long salary;

    private List<Command> commands = new ArrayList<>();

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public void accept(Command command) {
        command.execute(this);
        commands.add(command);
    }

    public boolean undo() {
        if (commands.isEmpty()) {
            return false;
        }
        else {
            Command command = commands.get(commands.size() - 1);
            command.undo(this);
            commands.remove(command);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public List<Command> getCommands() {
        return commands;
    }
}
