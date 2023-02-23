package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C5021m;
/* renamed from: com.google.android.play.core.assetpacks.m */
/* loaded from: classes2.dex */
final class BinderC4894m extends BinderC4889l<ParcelFileDescriptor> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4894m(C4910q c4910q, C5021m<ParcelFileDescriptor> c5021m) {
        super(c4910q, c5021m);
    }

    @Override // com.google.android.play.core.assetpacks.BinderC4889l, com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: l0 */
    public final void mo25889l0(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo25889l0(bundle, bundle2);
        this.f12388a.m25855e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
