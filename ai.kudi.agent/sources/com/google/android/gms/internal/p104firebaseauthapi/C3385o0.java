package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o0 */
/* loaded from: classes2.dex */
public final class C3385o0 extends C3567v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3385o0(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.C3567v0
    /* renamed from: a */
    public final void mo30160a() {
        if (!m30151l()) {
            for (int i = 0; i < m30159b(); i++) {
                Map.Entry m30154i = m30154i(i);
                if (((InterfaceC3035ap) m30154i.getKey()).m31414c()) {
                    m30154i.setValue(Collections.unmodifiableList((List) m30154i.getValue()));
                }
            }
            for (Map.Entry entry : m30158c()) {
                if (((InterfaceC3035ap) entry.getKey()).m31414c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo30160a();
    }
}
