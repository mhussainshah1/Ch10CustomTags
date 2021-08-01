package murach.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        String currentDateFormatted = currentDate.format(formatter);

//        Date currentDate = new Date();
//        DateFormat shortDate = DateFormat.getDateInstance(DateFormat.SHORT);
//        String currentDateFormatted = shortDate.format(currentDate);

        try {
            JspWriter out = pageContext.getOut();
            out.print(currentDateFormatted);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        return SKIP_BODY;
    }
}
