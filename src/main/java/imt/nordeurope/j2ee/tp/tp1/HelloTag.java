package imt.nordeurope.j2ee.tp.tp1;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class HelloTag extends TagSupport {
    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().println("Hello World !");
        } catch (IOException e) {
            throw new JspException("I/O Error", e);
        }
        return SKIP_BODY;
    }
}
