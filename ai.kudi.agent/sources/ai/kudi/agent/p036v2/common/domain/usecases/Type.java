package ai.kudi.agent.p036v2.common.domain.usecases;

import ai.kudi.mediaservice.marketplaceCollection.response.UploadResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.common.domain.usecases.Type */
/* loaded from: classes.dex */
public final /* synthetic */ class Type implements InterfaceC11291f {
    public static final /* synthetic */ Type GRIDSET;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Type $r0 = new Type();
        GRIDSET = $r0;
    }

    private /* synthetic */ Type() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        UploadResponse $r1 = (UploadResponse) obj;
        return FileUpload.m41535execute$lambda0($r1);
    }
}
