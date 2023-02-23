package ai.kudi.agent.register.domain.usecases;

import ai.kudi.mediaservice.dto.MediaUploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Label implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ Label f1016b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Label $r0 = new Label();
        f1016b = $r0;
    }

    private /* synthetic */ Label() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        MediaUploadResponse $r3 = (MediaUploadResponse) obj;
        FileUploadResponse $r1 = SaveImage.m40350execute$lambda0($r3);
        return $r1;
    }
}
