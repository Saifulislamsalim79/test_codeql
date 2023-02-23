package com.trello.rxlifecycle2.p194g;

import com.trello.rxlifecycle2.b;
import kotlin.e0.d.l;
import p425j.p444e.AbstractC11688p;
/* compiled from: rxlifecycle.kt */
/* renamed from: com.trello.rxlifecycle2.g.a */
/* loaded from: classes2.dex */
public final class C7392a {
    /* renamed from: a */
    public static final <T, E> AbstractC11688p<T> m18815a(AbstractC11688p<T> abstractC11688p, b<E> bVar) {
        l.g(abstractC11688p, "$receiver");
        l.g(bVar, "provider");
        AbstractC11688p<T> abstractC11688p2 = (AbstractC11688p<T>) abstractC11688p.m10504l(bVar.bindToLifecycle());
        l.c(abstractC11688p2, "this.compose<T>(provider.bindToLifecycle<T>())");
        return abstractC11688p2;
    }
}
