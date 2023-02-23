package com.trello.rxlifecycle2.p190e.p191a.p192a;

import androidx.lifecycle.o;
import com.trello.lifecycle2.android.lifecycle.AndroidLifecycle;
import kotlin.e0.d.l;
import p425j.p444e.AbstractC11688p;
/* compiled from: rxlifecycle.kt */
/* renamed from: com.trello.rxlifecycle2.e.a.a.a */
/* loaded from: classes2.dex */
public final class C7390a {
    /* renamed from: a */
    public static final <T> AbstractC11688p<T> m18817a(AbstractC11688p<T> abstractC11688p, o oVar) {
        l.g(abstractC11688p, "$receiver");
        l.g(oVar, "owner");
        AbstractC11688p<T> abstractC11688p2 = (AbstractC11688p<T>) abstractC11688p.m10504l(AndroidLifecycle.a(oVar).bindToLifecycle());
        l.c(abstractC11688p2, "this.compose(AndroidLife…owner).bindToLifecycle())");
        return abstractC11688p2;
    }
}
