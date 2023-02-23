package ai.kudi.agent.p036v2.common.view.fragment;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.common.view.fragment.Logger */
/* loaded from: classes.dex */
public final /* synthetic */ class Logger implements Object {
    public static final /* synthetic */ Logger log;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Logger $r0 = new Logger();
        log = $r0;
    }

    private /* synthetic */ Logger() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        $r2.printStackTrace();
    }
}
