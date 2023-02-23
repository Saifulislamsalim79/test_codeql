package ai.kudi.agent.register.p021ui.viewmodels;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.register.ui.viewmodels.Lock */
/* loaded from: classes.dex */
public final /* synthetic */ class Lock implements Object {
    public static final /* synthetic */ Lock lock;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Lock $r0 = new Lock();
        lock = $r0;
    }

    private /* synthetic */ Lock() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Boolean $r2 = (Boolean) obj;
        PictureUploadViewModel.m40428requestCameraPermission$lambda4($r2);
    }
}
