package interpreter;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class EmployeeRenderer {

    public String render(List<Employee> employees) {
        String template = "<ul><li th:each='employee: ${employees}'><span th:text='${employee.name}' /></li></ul>";
        TemplateEngine templateEngine = getTemplateEngine();
        Map<String, Object> variables =
                new HashMap<>();
        variables.put("employees", employees);
        Context context = new Context(new Locale("hu", "HU"),
                variables);
        return templateEngine.process(template, context);
    }

    private TemplateEngine getTemplateEngine() {
        TemplateEngine templateEngine = new TemplateEngine();
        StringTemplateResolver templateResolver = new StringTemplateResolver();
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateEngine.addTemplateResolver(templateResolver);
        return templateEngine;
    }
}
