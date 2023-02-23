package androidx.core.p058os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: LocaleListCompatWrapper.java */
/* renamed from: androidx.core.os.g */
/* loaded from: classes2.dex */
final class C1379g implements InterfaceC1380h {

    /* renamed from: b */
    private static final Locale[] f4250b = new Locale[0];

    /* renamed from: a */
    private final Locale[] f4251a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        C1378f.m36166b("en-Latn");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1379g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f4251a = f4250b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m36162b(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f4251a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        sb.toString();
    }

    /* renamed from: b */
    static void m36162b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // androidx.core.p058os.InterfaceC1380h
    /* renamed from: a */
    public Object mo36161a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1379g)) {
            return false;
        }
        Locale[] localeArr = ((C1379g) obj).f4251a;
        if (this.f4251a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f4251a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // androidx.core.p058os.InterfaceC1380h
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f4251a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f4251a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    @Override // androidx.core.p058os.InterfaceC1380h
    public int size() {
        return this.f4251a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f4251a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f4251a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
