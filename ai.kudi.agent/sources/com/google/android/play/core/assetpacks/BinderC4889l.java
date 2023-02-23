package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC4990o0;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.tasks.C5021m;
import java.util.List;
/* renamed from: com.google.android.play.core.assetpacks.l */
/* loaded from: classes2.dex */
class BinderC4889l<T> extends AbstractBinderC4990o0 {

    /* renamed from: a */
    final C5021m<T> f12388a;

    /* renamed from: b */
    final /* synthetic */ C4910q f12389b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4889l(C4910q c4910q, C5021m<T> c5021m) {
        this.f12389b = c4910q;
        this.f12388a = c5021m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4889l(C4910q c4910q, C5021m c5021m, byte[] bArr) {
        this(c4910q, c5021m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4889l(C4910q c4910q, C5021m c5021m, char[] cArr) {
        this(c4910q, c5021m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4889l(C4910q c4910q, C5021m c5021m, int[] iArr) {
        this(c4910q, c5021m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: E0 */
    public final void mo25901E0(int i) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: F0 */
    public void mo25900F0(Bundle bundle, Bundle bundle2) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: R0 */
    public void mo25899R0(int i, Bundle bundle) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: S0 */
    public void mo25898S0(Bundle bundle) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: T */
    public void mo25897T(Bundle bundle) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: a */
    public void mo25896a() {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: a */
    public void mo25895a(Bundle bundle) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        int i = bundle.getInt("error_code");
        c4957a = C4910q.f12460f;
        c4957a.m25955e("onError(%d)", Integer.valueOf(i));
        this.f12388a.m25856d(new AssetPackException(i));
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: a */
    public void mo25894a(List<Bundle> list) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: b */
    public void mo25893b() {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: b */
    public void mo25892b(Bundle bundle) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: j */
    public final void mo25891j(int i) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: k */
    public void mo25890k(Bundle bundle, Bundle bundle2) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12465d;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: l0 */
    public void mo25889l0(Bundle bundle, Bundle bundle2) throws RemoteException {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12389b.f12464c;
        c4983l.m25938b();
        c4957a = C4910q.f12460f;
        c4957a.m25954f("onGetChunkFileDescriptor", new Object[0]);
    }
}
