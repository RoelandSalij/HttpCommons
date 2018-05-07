// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package httpcommons.actions;

import com.mendix.m2ee.api.IMxRuntimeResponse;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class SetHeader extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String headerName;
	private java.lang.String headerValue;

	public SetHeader(IContext context, java.lang.String headerName, java.lang.String headerValue)
	{
		super(context);
		this.headerName = headerName;
		this.headerValue = headerValue;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		IContext ctx = getContext();
		IMxRuntimeResponse resp = ctx.getRuntimeResponse().get();
		resp.addHeader(headerName, headerValue);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SetHeader";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}