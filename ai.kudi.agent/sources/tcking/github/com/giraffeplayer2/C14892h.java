package tcking.github.com.giraffeplayer2;

import java.io.Serializable;
/* compiled from: Option.java */
/* renamed from: tcking.github.com.giraffeplayer2.h */
/* loaded from: classes3.dex */
public class C14892h implements Serializable, Cloneable {

    /* renamed from: c */
    private int f33333c;

    /* renamed from: d */
    private String f33334d;

    /* renamed from: e */
    private Object f33335e;

    /* renamed from: a */
    public C14892h clone() throws CloneNotSupportedException {
        return (C14892h) super.clone();
    }

    /* renamed from: b */
    public int m101b() {
        return this.f33333c;
    }

    /* renamed from: c */
    public String m100c() {
        return this.f33334d;
    }

    /* renamed from: d */
    public Object m99d() {
        return this.f33335e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14892h.class != obj.getClass()) {
            return false;
        }
        C14892h c14892h = (C14892h) obj;
        if (this.f33333c != c14892h.f33333c) {
            return false;
        }
        String str = this.f33334d;
        if (str == null ? c14892h.f33334d == null : str.equals(c14892h.f33334d)) {
            Object obj2 = this.f33335e;
            Object obj3 = c14892h.f33335e;
            return obj2 != null ? obj2.equals(obj3) : obj3 == null;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f33333c * 31;
        String str = this.f33334d;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Object obj = this.f33335e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
