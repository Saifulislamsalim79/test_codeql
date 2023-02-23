package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ca */
/* loaded from: classes2.dex */
public final class C3740ca extends C3849ja {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3740ca(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.C3849ja
    /* renamed from: a */
    public final void mo29448a() {
        if (!m29439l()) {
            for (int i = 0; i < m29447b(); i++) {
                Map.Entry m29442i = m29442i(i);
                if (((InterfaceC3754d8) m29442i.getKey()).m29677c()) {
                    m29442i.setValue(Collections.unmodifiableList((List) m29442i.getValue()));
                }
            }
            for (Map.Entry entry : m29446c()) {
                if (((InterfaceC3754d8) entry.getKey()).m29677c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo29448a();
    }
}
