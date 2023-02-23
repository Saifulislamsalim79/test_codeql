package ai.kudi.agent.register.p021ui.viewmodels;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.register.ui.viewmodels.LogLevel */
/* loaded from: classes.dex */
public final /* synthetic */ class LogLevel implements Object {
    public static final /* synthetic */ LogLevel SEVERE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        LogLevel $r0 = new LogLevel();
        SEVERE = $r0;
    }

    private /* synthetic */ LogLevel() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        PictureUploadViewModel.m40431requestForStoragePermission$lambda7($r2);
    }
}
