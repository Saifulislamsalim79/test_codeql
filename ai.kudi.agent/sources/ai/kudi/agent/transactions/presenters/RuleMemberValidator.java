package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.views.CreateCustomerView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class RuleMemberValidator implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ RuleMemberValidator RULE_VALIDATOR;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        RuleMemberValidator $r0 = new RuleMemberValidator();
        RULE_VALIDATOR = $r0;
    }

    private /* synthetic */ RuleMemberValidator() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void validate(Object obj) {
        CreateCustomerView $r2 = (CreateCustomerView) obj;
        CreateCustomerPresenter.m41144validateFields$lambda13($r2);
    }
}
