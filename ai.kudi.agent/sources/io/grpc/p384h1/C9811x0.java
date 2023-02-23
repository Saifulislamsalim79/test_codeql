package io.grpc.p384h1;

import java.util.ArrayList;
/* compiled from: InsightBuilder.java */
/* renamed from: io.grpc.h1.x0 */
/* loaded from: classes2.dex */
public final class C9811x0 {

    /* renamed from: a */
    private final ArrayList<String> f23034a = new ArrayList<>();

    /* renamed from: a */
    public C9811x0 m13939a(Object obj) {
        this.f23034a.add(String.valueOf(obj));
        return this;
    }

    /* renamed from: b */
    public C9811x0 m13938b(String str, Object obj) {
        ArrayList<String> arrayList = this.f23034a;
        arrayList.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f23034a.toString();
    }
}
