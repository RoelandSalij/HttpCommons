package system;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.actionmanagement.IActionRegistrator;

@Component(immediate = true)
public class UserActionsRegistrar
{
  @Reference
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(httpcommons.actions.GetCookie.class);
    registrator.registerUserAction(httpcommons.actions.GetHeader.class);
    registrator.registerUserAction(httpcommons.actions.GetIP.class);
    registrator.registerUserAction(httpcommons.actions.GetRequestString.class);
    registrator.registerUserAction(httpcommons.actions.GetResourcePath.class);
    registrator.registerUserAction(httpcommons.actions.SetContentType.class);
    registrator.registerUserAction(httpcommons.actions.SetCookie.class);
    registrator.registerUserAction(httpcommons.actions.SetHeader.class);
    registrator.registerUserAction(httpcommons.actions.SetStatus.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
