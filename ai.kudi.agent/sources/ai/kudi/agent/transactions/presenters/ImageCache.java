package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.views.TransactionDetailsView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ImageCache implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ ImageCache mImageCache;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ImageCache $r0 = new ImageCache();
        mImageCache = $r0;
    }

    private /* synthetic */ ImageCache() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void requestImage(Object obj) {
        TransactionDetailsView $r2 = (TransactionDetailsView) obj;
        TransactionDetailsPresenter.m41180fetchIssueCategoryByLabel$lambda6($r2);
    }
}
