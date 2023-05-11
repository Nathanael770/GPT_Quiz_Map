// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package quizcarte.proxies;

public class Usage
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject usageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QuizCarte.Usage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Prompt_tokens("Prompt_tokens"),
		Completion_tokens("Completion_tokens"),
		Total_tokens("Total_tokens"),
		Usage_Root("QuizCarte.Usage_Root");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Usage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Usage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject usageMendixObject)
	{
		if (usageMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, usageMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.usageMendixObject = usageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Usage.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static quizcarte.proxies.Usage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return quizcarte.proxies.Usage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static quizcarte.proxies.Usage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new quizcarte.proxies.Usage(context, mendixObject);
	}

	public static quizcarte.proxies.Usage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return quizcarte.proxies.Usage.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Prompt_tokens
	 */
	public final java.lang.Integer getPrompt_tokens()
	{
		return getPrompt_tokens(getContext());
	}

	/**
	 * @param context
	 * @return value of Prompt_tokens
	 */
	public final java.lang.Integer getPrompt_tokens(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Prompt_tokens.toString());
	}

	/**
	 * Set value of Prompt_tokens
	 * @param prompt_tokens
	 */
	public final void setPrompt_tokens(java.lang.Integer prompt_tokens)
	{
		setPrompt_tokens(getContext(), prompt_tokens);
	}

	/**
	 * Set value of Prompt_tokens
	 * @param context
	 * @param prompt_tokens
	 */
	public final void setPrompt_tokens(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer prompt_tokens)
	{
		getMendixObject().setValue(context, MemberNames.Prompt_tokens.toString(), prompt_tokens);
	}

	/**
	 * @return value of Completion_tokens
	 */
	public final java.lang.Integer getCompletion_tokens()
	{
		return getCompletion_tokens(getContext());
	}

	/**
	 * @param context
	 * @return value of Completion_tokens
	 */
	public final java.lang.Integer getCompletion_tokens(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Completion_tokens.toString());
	}

	/**
	 * Set value of Completion_tokens
	 * @param completion_tokens
	 */
	public final void setCompletion_tokens(java.lang.Integer completion_tokens)
	{
		setCompletion_tokens(getContext(), completion_tokens);
	}

	/**
	 * Set value of Completion_tokens
	 * @param context
	 * @param completion_tokens
	 */
	public final void setCompletion_tokens(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer completion_tokens)
	{
		getMendixObject().setValue(context, MemberNames.Completion_tokens.toString(), completion_tokens);
	}

	/**
	 * @return value of Total_tokens
	 */
	public final java.lang.Integer getTotal_tokens()
	{
		return getTotal_tokens(getContext());
	}

	/**
	 * @param context
	 * @return value of Total_tokens
	 */
	public final java.lang.Integer getTotal_tokens(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Total_tokens.toString());
	}

	/**
	 * Set value of Total_tokens
	 * @param total_tokens
	 */
	public final void setTotal_tokens(java.lang.Integer total_tokens)
	{
		setTotal_tokens(getContext(), total_tokens);
	}

	/**
	 * Set value of Total_tokens
	 * @param context
	 * @param total_tokens
	 */
	public final void setTotal_tokens(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer total_tokens)
	{
		getMendixObject().setValue(context, MemberNames.Total_tokens.toString(), total_tokens);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Usage_Root
	 */
	public final quizcarte.proxies.Root getUsage_Root() throws com.mendix.core.CoreException
	{
		return getUsage_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Usage_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final quizcarte.proxies.Root getUsage_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		quizcarte.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Usage_Root.toString());
		if (identifier != null) {
			result = quizcarte.proxies.Root.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Usage_Root
	 * @param usage_root
	 */
	public final void setUsage_Root(quizcarte.proxies.Root usage_root)
	{
		setUsage_Root(getContext(), usage_root);
	}

	/**
	 * Set value of Usage_Root
	 * @param context
	 * @param usage_root
	 */
	public final void setUsage_Root(com.mendix.systemwideinterfaces.core.IContext context, quizcarte.proxies.Root usage_root)
	{
		if (usage_root == null) {
			getMendixObject().setValue(context, MemberNames.Usage_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Usage_Root.toString(), usage_root.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return usageMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final quizcarte.proxies.Usage that = (quizcarte.proxies.Usage) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
