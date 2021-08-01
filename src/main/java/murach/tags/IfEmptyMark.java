package murach.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

import java.io.IOException;

public class IfEmptyMark extends TagSupport {
    private String field;
    private String color = "red";

    public void setField(String field) {
        this.field = field;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            var out = pageContext.getOut();
            if (field == null || field.length() == 0) {
                out.print("<font color= " + color + ">*</font>");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return SKIP_BODY;
    }
}
