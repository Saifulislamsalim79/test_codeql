package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3994se;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.r4 */
/* loaded from: classes2.dex */
final class C4348r4 implements InterfaceC3994se {

    /* renamed from: a */
    final /* synthetic */ C4372t4 f10635a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4348r4(C4372t4 c4372t4) {
        this.f10635a = c4372t4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3994se
    /* renamed from: a */
    public final void mo27987a(int i, String str, List<String> list, boolean z, boolean z2) {
        C4312o3 q;
        int i2 = i - 1;
        if (i2 == 0) {
            q = ((v5) this.f10635a).a.b().q();
        } else if (i2 != 1) {
            if (i2 == 3) {
                q = ((v5) this.f10635a).a.b().v();
            } else if (i2 != 4) {
                q = ((v5) this.f10635a).a.b().u();
            } else if (z) {
                q = ((v5) this.f10635a).a.b().y();
            } else if (!z2) {
                q = ((v5) this.f10635a).a.b().x();
            } else {
                q = ((v5) this.f10635a).a.b().w();
            }
        } else if (z) {
            q = ((v5) this.f10635a).a.b().t();
        } else if (!z2) {
            q = ((v5) this.f10635a).a.b().s();
        } else {
            q = ((v5) this.f10635a).a.b().r();
        }
        int size = list.size();
        if (size == 1) {
            q.m28013b(str, list.get(0));
        } else if (size == 2) {
            q.m28012c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            q.m28014a(str);
        } else {
            q.m28011d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
