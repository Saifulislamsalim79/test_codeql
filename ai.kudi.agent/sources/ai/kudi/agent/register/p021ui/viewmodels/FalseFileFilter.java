package ai.kudi.agent.register.p021ui.viewmodels;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.register.ui.viewmodels.FalseFileFilter */
/* loaded from: classes.dex */
public final /* synthetic */ class FalseFileFilter implements Object {
    public static final /* synthetic */ FalseFileFilter INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        FalseFileFilter $r0 = new FalseFileFilter();
        INSTANCE = $r0;
    }

    private /* synthetic */ FalseFileFilter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        PictureUploadViewModel.m40429requestCameraPermission$lambda5($r2);
    }
}
