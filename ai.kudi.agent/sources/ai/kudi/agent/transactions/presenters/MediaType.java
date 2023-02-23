package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.views.CreateCustomerView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class MediaType implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ MediaType BZIP2;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        MediaType $r0 = new MediaType();
        BZIP2 = $r0;
    }

    private /* synthetic */ MediaType() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void appendTo(Object obj) {
        CreateCustomerView $r2 = (CreateCustomerView) obj;
        CreateCustomerPresenter.m41137lookupCustomer$lambda0($r2);
    }
}
