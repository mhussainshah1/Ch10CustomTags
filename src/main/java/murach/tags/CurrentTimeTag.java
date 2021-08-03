package murach.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.JspTag;
import jakarta.servlet.jsp.tagext.TagSupport;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTimeFormatted = currentTime.format(formatter);

//        Date currentDate = new Date();
//        DateFormat shortDate = DateFormat.getDateInstance(DateFormat.SHORT);
//        String currentDateFormatted = shortDate.format(currentDate);

        try {
            JspWriter out = pageContext.getOut();
            out.print(currentTimeFormatted);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        return SKIP_BODY;
    }
}