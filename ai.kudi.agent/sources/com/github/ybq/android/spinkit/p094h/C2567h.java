package com.github.ybq.android.spinkit.p094h;

import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.AbstractC2552g;
/* compiled from: MultiplePulseRing.java */
/* renamed from: com.github.ybq.android.spinkit.h.h */
/* loaded from: classes2.dex */
public class C2567h extends AbstractC2552g {
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: N */
    public void mo32594N(AbstractC2540f... abstractC2540fArr) {
        int i = 0;
        while (i < abstractC2540fArr.length) {
            AbstractC2540f abstractC2540f = abstractC2540fArr[i];
            i++;
            abstractC2540f.m32631t(i * 200);
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        return new AbstractC2540f[]{new C2569j(), new C2569j(), new C2569j()};
    }
}
