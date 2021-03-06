#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * ${robotName} generated free by NoraUi Organization https://github.com/NoraUi
 * ${robotName} is licensed under the license BSD.
 * 
 * CAUTION: ${robotName} use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 */
package ${package}.application.pages.${targetApplicationId};

import static ${package}.utils.${robotName}Context.${targetApplicationId.toUpperCase()}_KEY;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ${package}.utils.${robotName}Context;

import com.github.noraui.application.page.Page;
import com.github.noraui.utils.Context;

public class ${targetApplicationName}Page extends Page {

    /**
     * Specific logger
     */
    private static final Logger logger = LoggerFactory.getLogger(${targetApplicationName}Page.class);

    public final PageElement accountMenu = new PageElement("-accountMenu", "Account menu");
    public final PageElement signinMenu = new PageElement("-signinMenu", "Sign-in menu");
    public final PageElement signoutMenu = new PageElement("-signoutMenu", "Sign-out menu");
    public final PageElement login = new PageElement("-login_field", "Login");
    public final PageElement password = new PageElement("-password_field", "Password");
    public final PageElement signInButton = new PageElement("-sign_in_button", "Sign-in button");
    public final PageElement signInMessage = new PageElement("-sign_in_message");

    private static final String TITLE_PAGE = "${targetApplicationTitle}";

    public ${targetApplicationName}Page() {
        super();
        this.application = ${targetApplicationId.toUpperCase()}_KEY;
        this.pageKey = "${targetApplicationId.toUpperCase()}_HOM";
        this.callBack = Context.getCallBack(${robotName}Context.CLOSE_WINDOW_AND_SWITCH_TO_${targetApplicationId.toUpperCase()}_HOME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkPage(Object... elements) {
        try {
            Context.waitUntil(ExpectedConditions.not(ExpectedConditions.titleIs("")));
            if (!TITLE_PAGE.equals(getDriver().getTitle())) {
                logger.error("HTML title is not good");
                return false;
            }
            return true;
        } catch (Exception e) {
            logger.error("HTML title Exception", e);
            return false;
        }
    }
    
    /**
     * isDisplayed returns true if ${targetApplicationId.toUpperCase()} portal page is displayed.
     *
     * @return boolean
     */
    public boolean isDisplayed() {
        return isDisplayed(TITLE_PAGE);
    }
    
    /**
     * isDisplayed returns true if the required ${targetApplicationId.toUpperCase()} portal page is displayed.
     *
     * @param titlePage
     *            The page title to check
     * @return boolean
     */
    public boolean isDisplayed(String titlePage) {
        try {
            Context.waitUntil(ExpectedConditions.not(ExpectedConditions.titleIs("")));
            if (!titlePage.equals(getDriver().getTitle())) {
                return false;
            }
        } catch (Exception e) {
            logger.error("Exception in isDisplayed", e);
            return false;
        }
        return true;
    }
    
}