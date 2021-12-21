package com.techoffice.view;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


public class JSFUtils {
    private static final String NO_RESOURCE_FOUND = "Missing resource: ";

    /**
     * Method for taking a reference to a JSF binding expression and returning
     * the matching object (or creating it).
     * @param expression EL expression
     * @return Managed object
     */
    public static Object resolveExpression(String expression) {
        FacesContext facesContext = getFacesContext();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, expression, Object.class);
        return valueExp.getValue(elContext);
    }

    // yasser Mohamed


    public static String getJudementText(BigDecimal year, BigDecimal month, BigDecimal day, BigDecimal attendanc,
                                         BigDecimal guranteeAmounts, BigDecimal workAmounts, BigDecimal penaltyAmounts,
                                         Boolean PenaltyFlg, Boolean executionFlg, Boolean stopExecute,
                                         Boolean foreverFlg, Boolean hardLabourFlg, String comment) {
        String judgText = "";
        //        String judg = "";
        String comments = "";
        BigDecimal years = BigDecimal.ZERO;
        BigDecimal days = BigDecimal.ZERO;
        BigDecimal months = BigDecimal.ZERO;
        BigDecimal attendance = BigDecimal.ZERO;
        BigDecimal guranteeAmount = BigDecimal.ZERO;
        BigDecimal workAmount = BigDecimal.ZERO;
        BigDecimal penaltyAmount = BigDecimal.ZERO;
        BigDecimal PenaltyFlag = BigDecimal.ONE;
        Boolean executionFlag = false;
        Boolean foreverFlag = false;
        Boolean hardLabourFlag = false;

        if (PenaltyFlag.compareTo(new BigDecimal(2)) == 0) {
            judgText = " \u0627\u0645\u0631\u062a \u0627\u0644\u0645\u062d\u0643\u0645\u0629 ";

        } else if (PenaltyFlag.compareTo(new BigDecimal(1)) == 0) {
            judgText = " \u062d\u0643\u0645\u062a \u0627\u0644\u0645\u062d\u0643\u0645\u0629";
        } else if (PenaltyFlag.compareTo(new BigDecimal(3)) == 0) {
            judgText = "\u0627\u0645\u0631\u062a \u0627\u0644\u0646\u064a\u0627\u0628\u0629 ";
        }

        if (executionFlg != null)
            executionFlag = (Boolean) executionFlg;
        if (foreverFlg != null)
            foreverFlag = (Boolean) foreverFlg;
        if (hardLabourFlg != null)
            hardLabourFlag = (Boolean) hardLabourFlg;

        //        if (JSFUtils.resolveExpression("#{bindings.ObjectionText.inputValue}") != null)
        //            judg = (String) JSFUtils.resolveExpression("#{bindings.ObjectionText.inputValue}");
        //
        //        if (JSFUtils.resolveExpression("#{bindings.JudgmentType.inputValue}") != null)
        //            PenaltyFlag = (BigDecimal) JSFUtils.resolveExpression("#{bindings.JudgmentType.inputValue}");
        if (attendanc != null)
            attendance = (BigDecimal) attendanc;
        if (workAmounts != null)
            workAmount = (BigDecimal) workAmounts;
        if (penaltyAmounts != null)
            penaltyAmount = (BigDecimal) penaltyAmounts;
        comments = (String) comment;
        //        System.err.println(attendance + "              PenaltyFlag         " + PenaltyFlag);
        //            BigDecimal attendance = new BigDecimal (attend.toString());bindings.Comments.inputValue
        //        if (PenaltyFlag.compareTo(new BigDecimal(2)) == 0) {
        //            judgText = " \u0627\u0645\u0631\u062a \u0627\u0644\u0645\u062d\u0643\u0645\u0629 ";
        //
        //        } else if (PenaltyFlag.compareTo(new BigDecimal(1)) == 0) {
        //            judgText = " \u062d\u0643\u0645\u062a \u0627\u0644\u0645\u062d\u0643\u0645\u0629";
        //        } else if (PenaltyFlag.compareTo(new BigDecimal(3)) == 0) {
        //            judgText = "\u0627\u0645\u0631\u062a \u0627\u0644\u0646\u064a\u0627\u0628\u0629 ";
        //        }
        if (attendance.compareTo(new BigDecimal(1)) == 0) {
            judgText = judgText + "  \u062d  ";
        } else if (attendance.compareTo(new BigDecimal(2)) == 0) {
            judgText = judgText + "  \u062d \u002d \u0623 ";
        } else if (attendance.compareTo(new BigDecimal(3)) == 0) {
            judgText = judgText + " \u063a ";
        }

        //        if (judg != null)
        //        {
        //            judgText = judgText +     judg + " ";
        //            }


        Boolean stopExecution = (Boolean) stopExecute;
        Boolean penFlag = (Boolean) PenaltyFlg;
        if (month != null)
            months = (BigDecimal) month;
        if (day != null)
            days = (BigDecimal) day;
        if (year != null)
            years = (BigDecimal) year;

        if (foreverFlag)
            judgText = judgText + " \u0628\u0627\u0644\u0645\u0624\u0628\u062f ";


        if (executionFlag)
            judgText = judgText + " \u0628\u0627\u0644\u0627\u0639\u062f\u0627\u0645 ";
        if (years.compareTo(BigDecimal.ZERO) == 1 || days.compareTo(BigDecimal.ZERO) == 1 ||

            months.compareTo(BigDecimal.ZERO) == 1) {
            judgText = judgText + " \u062d\u0628\u0633 ";
            if (years.compareTo(BigDecimal.ZERO) == 1) {
                judgText = judgText + years + " \u0633\u0646\u0629 ";
            }
            if (months.compareTo(BigDecimal.ZERO) == 1) {
                judgText = judgText + " \u0648 " + months + " \u0634\u0647\u0631 ";
            }
            if (days.compareTo(BigDecimal.ZERO) == 1) {
                judgText = judgText + " \u0648 " + days + " \u064a\u0648\u0645 ";
            }


        }

        if (hardLabourFlag)
            judgText =
                judgText +
                " \u0645\u0639 \u0627\u0644\u0627\u0634\u063a\u0627\u0644 \u0627\u0644\u0634\u0627\u0642\u0647 ";

        System.err.println(stopExecution + "@@@@@@@@@@  " + penFlag);
        if (!stopExecution && penFlag)
            judgText = judgText + " \u0645\u0639 \u0627\u0644\u0646\u0641\u0627\u0630 ";
        else if (stopExecution && !penFlag) {
            judgText =
                judgText + " \u0645\u0639 \u0627\u064a\u0642\u0627\u0641 \u0627\u0644\u062a\u0646\u0641\u064a\u0630 ";
            guranteeAmount = new BigDecimal(0);
        } else if (stopExecution && penFlag)
            judgText = judgText + " ";

        if (guranteeAmounts != null)
            guranteeAmount = (BigDecimal) guranteeAmounts;
        if (((BigDecimal) guranteeAmount).intValue() > 0) {
            judgText = judgText + " \u0648 \u0643\u0641\u0627\u0644\u0629 " + guranteeAmount + " \u062c\u002d\u0645 ";
        }

        if (((BigDecimal) workAmount).intValue() > 0) {
            judgText =
                judgText + " \u0648 \u063a\u0631\u0627\u0645\u0629 \u064a\u0648\u0645\u064a\u0629  " + workAmount +
                " \u062c\u002d\u0645 ";
        }
        if (((BigDecimal) penaltyAmount).intValue() > 0) {
            judgText =
                judgText + " \u0648 \u063a\u0631\u0627\u0645\u0629 \u062b\u0627\u0628\u062a\u0629  " + penaltyAmount +
                " \u062c\u002d\u0645 ";
        }

        System.err.println("MAGGGGGGGGGGG" + comments);
        if (comments != null) {
            //                    judgText = judgText+" �  " +comments ;
            judgText = judgText + "  " + comments;
        }


        System.out.println("Judge  >>> " + judgText);


        System.err.println(years);


        return judgText;
    }


    public static void hidePopup(String pId) {
        FacesContext context = FacesContext.getCurrentInstance();
        String popupId = findComponentInRoot(pId).getClientId(context);

        ExtendedRenderKitService erkService =
            Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
        erkService.addScript(context, "AdfPage.PAGE.findComponent('" + popupId + "').hide();");
    }

    public static void showPopup(String pId) {
        FacesContext context = FacesContext.getCurrentInstance();
        String popupId = findComponentInRoot(pId).getClientId(context);

        ExtendedRenderKitService erkService =
            Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
        erkService.addScript(context, "AdfPage.PAGE.findComponent('" + popupId + "').show();");
    }


    //END Show Hide Popup By ID -----------

    public static void calljqHelper(String script) {
        FacesContext context = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
        erks.addScript(context, script);
    }

    // yasser mohamed

    public static void addToSession(String name, Object value) {

        ADFContext.getCurrent().getSessionScope().put(name, value);
    }

    public static void addToRequestScope(String name, Object value) {

        ADFContext.getCurrent().getRequestScope().put(name, value);
    }

    public static void removeFromRequestScope(String name) {

        ADFContext.getCurrent().getRequestScope().remove(name);
    }

    public static void getFromRequestScope(String name) {

        ADFContext.getCurrent().getRequestScope().get(name);
    }

    public static void addToApplicationScope(String name, Object value) {

        ADFContext.getCurrent().getApplicationScope().put(name, value);

    }

    public static void addToViewScope(String name, Object value) {
        ADFContext.getCurrent().getViewScope().put(name, value);
    }

    public static void addToPageFlowScope(String name, Object value) {
        ADFContext.getCurrent().getPageFlowScope().put(name, value);
    }

    public static void deleteFromPageFlowScope(String name) {
        ADFContext.getCurrent().getPageFlowScope().remove(name);
    }


    //

    public static void refreshComponent(String c_id) {
        UIComponent uiComp = findComponentInRoot(c_id);
        if (uiComp == null)
            return;
        AdfFacesContext.getCurrentInstance().addPartialTarget(uiComp);
    }
    
    public static void refreshComponents(String[] c_ids) {
        for (String c_id : c_ids) {
            UIComponent uiComp = findComponentInRoot(c_id);
            if (uiComp == null)
                break;
            AdfFacesContext.getCurrentInstance().addPartialTarget(uiComp);
        }
    }

    // END Refresh Component By ID


    public static void refresh() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String refreshpage = facesContext.getViewRoot().getViewId();
        ViewHandler viewHandler = facesContext.getApplication().getViewHandler();
        UIViewRoot viewroot = viewHandler.createView(facesContext, refreshpage);
        viewroot.setViewId(refreshpage);
        facesContext.setViewRoot(viewroot);
    }

    public static String resolveRemoteUser() {
        FacesContext facesContext = getFacesContext();
        ExternalContext ectx = facesContext.getExternalContext();
        return ectx.getRemoteUser();
    }

    public static String resolveUserPrincipal() {
        FacesContext facesContext = getFacesContext();
        ExternalContext ectx = facesContext.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) ectx.getRequest();
        return request.getUserPrincipal().getName();
    }

    public static Object resolveMethodExpression(String expression, Class returnType, Class[] argTypes,
                                                 Object[] argValues) {
        FacesContext facesContext = getFacesContext();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        MethodExpression methodExpression =
            elFactory.createMethodExpression(elContext, expression, returnType, argTypes);
        return methodExpression.invoke(elContext, argValues);
    }

    /**
     * Method for taking a reference to a JSF binding expression and returning
     * the matching Boolean.
     * @param expression EL expression
     * @return Managed object
     */
    public static Boolean resolveExpressionAsBoolean(String expression) {
        return (Boolean) resolveExpression(expression);
    }

    /**
     * Method for taking a reference to a JSF binding expression and returning
     * the matching String (or creating it).
     * @param expression EL expression
     * @return Managed object
     */
    public static String resolveExpressionAsString(String expression) {
        return (String) resolveExpression(expression);
    }

    /**
     * Convenience method for resolving a reference to a managed bean by name
     * rather than by expression.
     * @param beanName name of managed bean
     * @return Managed object
     */
    public static Object getManagedBeanValue(String beanName) {
        StringBuffer buff = new StringBuffer("#{");
        buff.append(beanName);
        buff.append("}");
        return resolveExpression(buff.toString());
    }

    /**
     * Method for setting a new object into a JSF managed bean
     * Note: will fail silently if the supplied object does
     * not match the type of the managed bean.
     * @param expression EL expression
     * @param newValue new value to set
     */
    public static void setExpressionValue(String expression, Object newValue) {
        FacesContext facesContext = getFacesContext();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, expression, Object.class);

        //Check that the input newValue can be cast to the property type
        //expected by the managed bean.
        //If the managed Bean expects a primitive we rely on Auto-Unboxing
        //I could do a more comprehensive check and conversion from the object
        //to the equivilent primitive but life is too short
        Class bindClass = valueExp.getType(elContext);
        if (bindClass.isPrimitive() || bindClass.isInstance(newValue)) {
            valueExp.setValue(elContext, newValue);
        }
    }

    /**
     * Convenience method for setting the value of a managed bean by name
     * rather than by expression.
     * @param beanName name of managed bean
     * @param newValue new value to set
     */
    public static void setManagedBeanValue(String beanName, Object newValue) {
        StringBuffer buff = new StringBuffer("#{");
        buff.append(beanName);
        buff.append("}");
        setExpressionValue(buff.toString(), newValue);
    }


    /**
     * Convenience method for setting Session variables.
     * @param key object key
     * @param object value to store
     */

    public static void storeOnSession(String key, Object object) {
        FacesContext ctx = getFacesContext();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.put(key, object);
    }

    /**
     * Convenience method for getting Session variables.
     * @param key object key
     * @return session object for key
     */
    public static Object getFromSession(String key) {
        FacesContext ctx = getFacesContext();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        return sessionState.get(key);
    }

    public static String getFromHeader(String key) {
        FacesContext ctx = getFacesContext();
        ExternalContext ectx = ctx.getExternalContext();
        return ectx.getRequestHeaderMap().get(key);
    }

    /**
     * Convenience method for getting Request variables.
     * @param key object key
     * @return session object for key
     */
    public static Object getFromRequest(String key) {
        FacesContext ctx = getFacesContext();
        Map sessionState = ctx.getExternalContext().getRequestMap();
        return sessionState.get(key);
    }

    /**
     * Pulls a String resource from the property bundle that
     * is defined under the application &lt;message-bundle&gt; element in
     * the faces config. Respects Locale
     * @param key string message key
     * @return Resource value or placeholder error String
     */
    public static String getStringFromBundle(String key) {
        ResourceBundle bundle = getBundle();
        return getStringSafely(bundle, key, null);
    }


    /**
     * Convenience method to construct a <code>FacesMesssage</code>
     * from a defined error key and severity
     * This assumes that the error keys follow the convention of
     * using <b>_detail</b> for the detailed part of the
     * message, otherwise the main message is returned for the
     * detail as well.
     * @param key for the error message in the resource bundle
     * @param severity severity of message
     * @return Faces Message object
     */
    public static FacesMessage getMessageFromBundle(String key, FacesMessage.Severity severity) {
        ResourceBundle bundle = getBundle();
        String summary = getStringSafely(bundle, key, null);
        String detail = getStringSafely(bundle, key + "_detail", summary);
        FacesMessage message = new FacesMessage(summary, detail);
        message.setSeverity(severity);
        return message;
    }
    public static String getMessageFromBundle(String key) {
        ResourceBundle bundle = getBundle();
        String message = getStringSafely(bundle, key, null);
        return message;
    }


    /**
     * Add JSF info message.
     * @param msg info message string
     */
    public static void addFacesInformationMessage(String msg) {
        FacesContext ctx = getFacesContext();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, "");
        ctx.addMessage(getRootViewComponentId(), fm);
    }

    /**
     * Add JSF info message.
     * @param msg info message string
     */
    public static void addFacesWarningMessage(String msg) {
        FacesContext ctx = getFacesContext();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, msg, "");
        ctx.addMessage(getRootViewComponentId(), fm);
    }

    /**
     * Add JSF error message.
     * @param msg error message string
     */
    public static void addFacesErrorMessage(String msg) {
        FacesContext ctx = getFacesContext();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, "");
        ctx.addMessage(getRootViewComponentId(), fm);
    }
    
    public static void removeViewScopeForBean(String beanName){
        FacesContext.getCurrentInstance().getViewRoot().getViewMap().remove(beanName);    
    }

    /**
     * Add JSF error message for a specific attribute.
     * @param attrName name of attribute
     * @param msg error message string
     */
    public static void addFacesErrorMessage(String attrName, String msg) {
        FacesContext ctx = getFacesContext();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, attrName, msg);
        ctx.addMessage(getRootViewComponentId(), fm);
    }

    // Informational getters

    /**
     * Get view id of the view root.
     * @return view id of the view root
     */
    public static String getRootViewId() {
        return getFacesContext().getViewRoot().getViewId();
    }

    /**
     * Get component id of the view root.
     * @return component id of the view root
     */
    public static String getRootViewComponentId() {
        return getFacesContext().getViewRoot().getId();
    }

    /**
     * Get FacesContext.
     * @return FacesContext
     */
    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }
    /*
       * Internal method to pull out the correct local
       * message bundle
       */

    private static ResourceBundle getBundle() {
        FacesContext ctx = getFacesContext();
        UIViewRoot uiRoot = ctx.getViewRoot();
        Locale locale = uiRoot.getLocale();
        ClassLoader ldr = Thread.currentThread().getContextClassLoader();
        return ResourceBundle.getBundle(ctx.getApplication().getMessageBundle(), locale, ldr);
    }

    /**
     * Get an HTTP Request attribute.
     * @param name attribute name
     * @return attribute value
     */
    public static Object getRequestAttribute(String name) {
        return getFacesContext().getExternalContext().getRequestMap().get(name);
    }

    /**
     * Set an HTTP Request attribute.
     * @param name attribute name
     * @param value attribute value
     */
    public static void setRequestAttribute(String name, Object value) {
        getFacesContext().getExternalContext().getRequestMap().put(name, value);
    }

    /*
       * Internal method to proxy for resource keys that don't exist
       */

    private static String getStringSafely(ResourceBundle bundle, String key, String defaultValue) {
        String resource = null;
        try {
            resource = bundle.getString(key);
        } catch (MissingResourceException mrex) {
            if (defaultValue != null) {
                resource = defaultValue;
            } else {
                resource = NO_RESOURCE_FOUND + key;
            }
        }
        return resource;
    }

    /**
     * Locate an UIComponent in view root with its component id. Use a recursive way to achieve this.
     * Taken from http://www.jroller.com/page/mert?entry=how_to_find_a_uicomponent
     * @param id UIComponent id
     * @return UIComponent object
     */
    public static UIComponent findComponentInRoot(String id) {
        UIComponent component = null;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        if (facesContext != null) {
            UIComponent root = facesContext.getViewRoot();
            component = findComponent(root, id);
        }
        return component;
    }

    /**
     * Locate an UIComponent from its root component.
     * Taken from http://www.jroller.com/page/mert?entry=how_to_find_a_uicomponent
     * @param base root Component (parent)
     * @param id UIComponent id
     * @return UIComponent object
     */
    public static UIComponent findComponent(UIComponent base, String id) {
        if (id.equals(base.getId()))
            return base;

        UIComponent children = null;
        UIComponent result = null;
        Iterator childrens = base.getFacetsAndChildren();
        while (childrens.hasNext() && (result == null)) {
            children = (UIComponent) childrens.next();
            if (id.equals(children.getId())) {
                result = children;
                break;
            }
            result = findComponent(children, id);
            if (result != null) {
                break;
            }
        }
        return result;
    }

    /**
     * Method to create a redirect URL. The assumption is that the JSF servlet mapping is
     * "faces", which is the default
     *
     * @param view the JSP or JSPX page to redirect to
     * @return a URL to redirect to
     */
    public static String getPageURL(String view) {
        FacesContext facesContext = getFacesContext();
        ExternalContext externalContext = facesContext.getExternalContext();
        String url = ((HttpServletRequest) externalContext.getRequest()).getRequestURL().toString();
        StringBuffer newUrlBuffer = new StringBuffer();
        newUrlBuffer.append(url.substring(0, url.lastIndexOf("faces/")));
        newUrlBuffer.append("faces");
        String targetPageUrl = view.startsWith("/") ? view : "/" + view;
        newUrlBuffer.append(targetPageUrl);
        return newUrlBuffer.toString();
    }

    public static ExternalContext getExternalContext() {
        return getFacesContext().getExternalContext();
    }

    public static HttpServletRequest getCurrentHttpRequest() {
        return (HttpServletRequest) getExternalContext().getRequest();
    }

    public static HttpServletResponse getCurrentHttpResponse() {
        return (HttpServletResponse) getExternalContext().getResponse();
    }

    public static Cookie[] getAllCookies() {
        return getCurrentHttpRequest().getCookies();
    }

    public static Cookie getCookieByName(String cookieName) {
        Cookie[] allCookies = getAllCookies();
        if (allCookies != null) {
            for (Cookie cookie : allCookies) {
                if (cookie.getName().equals(cookieName)) {
                    return cookie;
                }
            }
        }
        return null;
    }

    public static String getFromBundle(String bndName, String key) {
        return (String) resolveExpression("#{" + bndName + "." + key + "}");
    }

    public static String getRequestParam(String key) {
        return getCurrentHttpRequest().getParameter(key);
    }

    public static void showFacesErrorMessageFromBundle(String bnd, String key) {
        addFacesErrorMessage(getFromBundle(bnd, key));
    }

    public static void showFacesInfoMessageFromBundle(String bnd, String key) {
        addFacesInformationMessage(getFromBundle(bnd, key));
    }

    public static void showFacesWarningMessageFromBundle(String bnd, String key) {
        addFacesWarningMessage(getFromBundle(bnd, key));
    }

    public static Object getFromPageFlowScope(String key) {
        return AdfFacesContext.getCurrentInstance().getPageFlowScope().get(key);
    }


    public static String getCurrentViewId() {
        FacesContext facesCtx = FacesContext.getCurrentInstance();
        String viewId = facesCtx.getViewRoot().getViewId();
        return viewId;
    }
    private static ResourceBundle bundleValue;

    public static String getActivityNameFromBundle(String activityName) {
        if (bundleValue == null) {
            bundleValue = ResourceBundle.getBundle("com.rss.cj.bundle.vcResourceBundle_ar", Locale.ENGLISH);
            // bundleValue = ResourceBundle.getBundle("com.rss.cj.bundle.vcResourceBundle_ar.properties");
        }
        return bundleValue.getString(activityName);
    }

    public static String getApplicationContextParam(String key) {
        String initParameter = FacesContext.getCurrentInstance().getExternalContext().getInitParameter(key);
        return initParameter;
    }

    public static Object getApplicationAttribute(String key) {
        return getExternalContext().getApplicationMap().get(key);
    }


    public static void setApplicationAttribute(String key, Object value) {
        getExternalContext().getApplicationMap().put(key, value);
    }

    public static void invokeJavaScript(String script) {
        FacesContext context = FacesContext.getCurrentInstance();
        //        if (AdfFacesContext.getCurrentInstance().isPartialRequest(context)) {
        ExtendedRenderKitService erks = Service.getRenderKitService(context, ExtendedRenderKitService.class);
        erks.addScript(context, script);
        //        }
    }

    public static void setSessionAttribute(String key, Object object) {
        FacesContext ctx = getFacesContext();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.put(key, object);
    }

    public static HttpServletRequest getRequest() {
        return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
    }
    
    
    public static Date removeTime(Date date) {
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
    
    public static Date getEndOfDayDate(Date date){
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, cal.getActualMaximum(Calendar.HOUR_OF_DAY));
        cal.set(Calendar.MINUTE, cal.getActualMaximum(Calendar.MINUTE));
        cal.set(Calendar.SECOND, cal.getActualMaximum(Calendar.SECOND));
        cal.set(Calendar.MILLISECOND, cal.getActualMaximum(Calendar.MILLISECOND));
        return cal.getTime();
    }
    
    
    
    public static Long convertToLong(Object o){
        Long l = null;
        try{
         l = Long.parseLong(o.toString());
        }catch(Exception e){
            
        }
        return l;
    }
}