package com.google.firebase.database.p131s;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.C5921b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: Path.java */
/* renamed from: com.google.firebase.database.s.l */
/* loaded from: classes2.dex */
public class C5830l implements Iterable<C5921b>, Comparable<C5830l> {

    /* renamed from: f */
    private static final C5830l f14311f = new C5830l("");

    /* renamed from: c */
    private final C5921b[] f14312c;

    /* renamed from: d */
    private final int f14313d;

    /* renamed from: e */
    private final int f14314e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Path.java */
    /* renamed from: com.google.firebase.database.s.l$a */
    /* loaded from: classes2.dex */
    public class C5831a implements Iterator<C5921b> {

        /* renamed from: c */
        int f14315c;

        C5831a() {
            this.f14315c = C5830l.this.f14313d;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C5921b next() {
            if (hasNext()) {
                C5921b[] c5921bArr = C5830l.this.f14312c;
                int i = this.f14315c;
                C5921b c5921b = c5921bArr[i];
                this.f14315c = i + 1;
                return c5921b;
            }
            throw new NoSuchElementException("No more elements.");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14315c < C5830l.this.f14314e;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public C5830l(C5921b... c5921bArr) {
        this.f14312c = (C5921b[]) Arrays.copyOf(c5921bArr, c5921bArr.length);
        this.f14313d = 0;
        this.f14314e = c5921bArr.length;
        for (C5921b c5921b : c5921bArr) {
            C5795m.m23744g(c5921b != null, "Can't construct a path with a null value!");
        }
    }

    /* renamed from: X */
    public static C5830l m23588X() {
        return f14311f;
    }

    /* renamed from: d0 */
    public static C5830l m23585d0(C5830l c5830l, C5830l c5830l2) {
        C5921b m23587Z = c5830l.m23587Z();
        C5921b m23587Z2 = c5830l2.m23587Z();
        if (m23587Z == null) {
            return c5830l2;
        }
        if (m23587Z.equals(m23587Z2)) {
            return m23585d0(c5830l.m23583e0(), c5830l2.m23583e0());
        }
        throw new DatabaseException("INTERNAL ERROR: " + c5830l2 + " is not contained in " + c5830l);
    }

    /* renamed from: F */
    public List<String> m23594F() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<C5921b> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m23298b());
        }
        return arrayList;
    }

    /* renamed from: I */
    public C5830l m23593I(C5830l c5830l) {
        int size = size() + c5830l.size();
        C5921b[] c5921bArr = new C5921b[size];
        System.arraycopy(this.f14312c, this.f14313d, c5921bArr, 0, size());
        System.arraycopy(c5830l.f14312c, c5830l.f14313d, c5921bArr, size(), c5830l.size());
        return new C5830l(c5921bArr, 0, size);
    }

    /* renamed from: J */
    public C5830l m23592J(C5921b c5921b) {
        int size = size();
        int i = size + 1;
        C5921b[] c5921bArr = new C5921b[i];
        System.arraycopy(this.f14312c, this.f14313d, c5921bArr, 0, size);
        c5921bArr[size] = c5921b;
        return new C5830l(c5921bArr, 0, i);
    }

    @Override // java.lang.Comparable
    /* renamed from: O */
    public int compareTo(C5830l c5830l) {
        int i = this.f14313d;
        int i2 = c5830l.f14313d;
        while (i < this.f14314e && i2 < c5830l.f14314e) {
            int compareTo = this.f14312c[i].compareTo(c5830l.f14312c[i2]);
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
            i2++;
        }
        if (i == this.f14314e && i2 == c5830l.f14314e) {
            return 0;
        }
        return i == this.f14314e ? -1 : 1;
    }

    /* renamed from: P */
    public boolean m23590P(C5830l c5830l) {
        if (size() > c5830l.size()) {
            return false;
        }
        int i = this.f14313d;
        int i2 = c5830l.f14313d;
        while (i < this.f14314e) {
            if (!this.f14312c[i].equals(c5830l.f14312c[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: V */
    public C5921b m23589V() {
        if (isEmpty()) {
            return null;
        }
        return this.f14312c[this.f14314e - 1];
    }

    /* renamed from: Z */
    public C5921b m23587Z() {
        if (isEmpty()) {
            return null;
        }
        return this.f14312c[this.f14313d];
    }

    /* renamed from: b0 */
    public C5830l m23586b0() {
        if (isEmpty()) {
            return null;
        }
        return new C5830l(this.f14312c, this.f14313d, this.f14314e - 1);
    }

    /* renamed from: e0 */
    public C5830l m23583e0() {
        int i = this.f14313d;
        if (!isEmpty()) {
            i++;
        }
        return new C5830l(this.f14312c, i, this.f14314e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5830l) {
            if (this == obj) {
                return true;
            }
            C5830l c5830l = (C5830l) obj;
            if (size() != c5830l.size()) {
                return false;
            }
            int i = this.f14313d;
            for (int i2 = c5830l.f14313d; i < this.f14314e && i2 < c5830l.f14314e; i2++) {
                if (!this.f14312c[i].equals(c5830l.f14312c[i2])) {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public String m23582f0() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.f14313d; i < this.f14314e; i++) {
            if (i > this.f14313d) {
                sb.append("/");
            }
            sb.append(this.f14312c[i].m23298b());
        }
        return sb.toString();
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = this.f14313d; i2 < this.f14314e; i2++) {
            i = (i * 37) + this.f14312c[i2].hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f14313d >= this.f14314e;
    }

    @Override // java.lang.Iterable
    public Iterator<C5921b> iterator() {
        return new C5831a();
    }

    public int size() {
        return this.f14314e - this.f14313d;
    }

    public String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.f14313d; i < this.f14314e; i++) {
            sb.append("/");
            sb.append(this.f14312c[i].m23298b());
        }
        return sb.toString();
    }

    public C5830l(List<String> list) {
        this.f14312c = new C5921b[list.size()];
        int i = 0;
        for (String str : list) {
            this.f14312c[i] = C5921b.m23296g(str);
            i++;
        }
        this.f14313d = 0;
        this.f14314e = list.size();
    }

    public C5830l(String str) {
        String[] split = str.split("/", -1);
        int i = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i++;
            }
        }
        this.f14312c = new C5921b[i];
        int i2 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.f14312c[i2] = C5921b.m23296g(str3);
                i2++;
            }
        }
        this.f14313d = 0;
        this.f14314e = this.f14312c.length;
    }

    private C5830l(C5921b[] c5921bArr, int i, int i2) {
        this.f14312c = c5921bArr;
        this.f14313d = i;
        this.f14314e = i2;
    }
}
