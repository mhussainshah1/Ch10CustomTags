package murach.tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class IfWeekdayTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek day = currentDate.getDayOfWeek();
        if(day==DayOfWeek.SATURDAY || day==DayOfWeek.SUNDAY){
            return SKIP_BODY;
        } else{
            return EVAL_BODY_INCLUDE;
        }
    }
}
