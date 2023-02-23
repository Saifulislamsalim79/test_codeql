package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.transfer.views.TransferToBankCustomerView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class RuleFieldValidator implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ RuleFieldValidator RULE_VALIDATOR;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        RuleFieldValidator $r0 = new RuleFieldValidator();
        RULE_VALIDATOR = $r0;
    }

    private /* synthetic */ RuleFieldValidator() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addError(Object obj) {
        TransferToBankCustomerView $r2 = (TransferToBankCustomerView) obj;
        TransferToBankCustomerPresenter.m41350validateFields$lambda7($r2);
    }
}
