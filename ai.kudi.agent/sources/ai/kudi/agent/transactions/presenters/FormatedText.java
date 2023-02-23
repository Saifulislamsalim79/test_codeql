package ai.kudi.agent.transactions.presenters;

import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class FormatedText implements Object {
    public static final /* synthetic */ FormatedText SINGLE_SPACE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        FormatedText $r0 = new FormatedText();
        SINGLE_SPACE = $r0;
    }

    private /* synthetic */ FormatedText() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        Timber.log($r2);
    }
}
