package p577n.p578a.p579a;

import java.util.ArrayList;
import java.util.List;
import p577n.p578a.p579a.p581v.C14406a;
import p577n.p578a.p579a.p581v.C14410c;
import p577n.p578a.p579a.p581v.C14411d;
import p577n.p578a.p582b.C14426o;
/* compiled from: LinkReferenceDefinitionParser.java */
/* renamed from: n.a.a.o */
/* loaded from: classes3.dex */
public class C14391o {

    /* renamed from: d */
    private StringBuilder f31752d;

    /* renamed from: e */
    private String f31753e;

    /* renamed from: f */
    private String f31754f;

    /* renamed from: g */
    private char f31755g;

    /* renamed from: h */
    private StringBuilder f31756h;

    /* renamed from: a */
    private EnumC14393b f31749a = EnumC14393b.START_DEFINITION;

    /* renamed from: b */
    private final StringBuilder f31750b = new StringBuilder();

    /* renamed from: c */
    private final List<C14426o> f31751c = new ArrayList();

    /* renamed from: i */
    private boolean f31757i = false;

    /* compiled from: LinkReferenceDefinitionParser.java */
    /* renamed from: n.a.a.o$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C14392a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31758a;

        static {
            int[] iArr = new int[EnumC14393b.values().length];
            f31758a = iArr;
            try {
                iArr[EnumC14393b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31758a[EnumC14393b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31758a[EnumC14393b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31758a[EnumC14393b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31758a[EnumC14393b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31758a[EnumC14393b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkReferenceDefinitionParser.java */
    /* renamed from: n.a.a.o$b */
    /* loaded from: classes3.dex */
    public enum EnumC14393b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    /* renamed from: a */
    private int m1857a(CharSequence charSequence, int i) {
        String charSequence2;
        int m1810m = C14411d.m1810m(charSequence, i, charSequence.length());
        int m1827a = C14410c.m1827a(charSequence, m1810m);
        if (m1827a == -1) {
            return -1;
        }
        if (charSequence.charAt(m1810m) == '<') {
            charSequence2 = charSequence.subSequence(m1810m + 1, m1827a - 1).toString();
        } else {
            charSequence2 = charSequence.subSequence(m1810m, m1827a).toString();
        }
        this.f31754f = charSequence2;
        int m1810m2 = C14411d.m1810m(charSequence, m1827a, charSequence.length());
        if (m1810m2 >= charSequence.length()) {
            this.f31757i = true;
            this.f31750b.setLength(0);
        } else if (m1810m2 == m1827a) {
            return -1;
        }
        this.f31749a = EnumC14393b.START_TITLE;
        return m1810m2;
    }

    /* renamed from: b */
    private void m1856b() {
        if (this.f31757i) {
            String m1831d = C14406a.m1831d(this.f31754f);
            StringBuilder sb = this.f31756h;
            this.f31751c.add(new C14426o(this.f31753e, m1831d, sb != null ? C14406a.m1831d(sb.toString()) : null));
            this.f31752d = null;
            this.f31757i = false;
            this.f31753e = null;
            this.f31754f = null;
            this.f31756h = null;
        }
    }

    /* renamed from: e */
    private int m1853e(CharSequence charSequence, int i) {
        int i2;
        int m1825c = C14410c.m1825c(charSequence, i);
        if (m1825c == -1) {
            return -1;
        }
        this.f31752d.append(charSequence, i, m1825c);
        if (m1825c >= charSequence.length()) {
            this.f31752d.append('\n');
            return m1825c;
        } else if (charSequence.charAt(m1825c) != ']' || (i2 = m1825c + 1) >= charSequence.length() || charSequence.charAt(i2) != ':' || this.f31752d.length() > 999) {
            return -1;
        } else {
            String m1834a = C14406a.m1834a(this.f31752d.toString());
            if (m1834a.isEmpty()) {
                return -1;
            }
            this.f31753e = m1834a;
            this.f31749a = EnumC14393b.DESTINATION;
            return C14411d.m1810m(charSequence, i2 + 1, charSequence.length());
        }
    }

    /* renamed from: g */
    private int m1851g(CharSequence charSequence, int i) {
        int m1810m = C14411d.m1810m(charSequence, i, charSequence.length());
        if (m1810m >= charSequence.length() || charSequence.charAt(m1810m) != '[') {
            return -1;
        }
        this.f31749a = EnumC14393b.LABEL;
        this.f31752d = new StringBuilder();
        int i2 = m1810m + 1;
        if (i2 >= charSequence.length()) {
            this.f31752d.append('\n');
        }
        return i2;
    }

    /* renamed from: h */
    private int m1850h(CharSequence charSequence, int i) {
        int m1810m = C14411d.m1810m(charSequence, i, charSequence.length());
        if (m1810m >= charSequence.length()) {
            this.f31749a = EnumC14393b.START_DEFINITION;
            return m1810m;
        }
        this.f31755g = (char) 0;
        char charAt = charSequence.charAt(m1810m);
        if (charAt == '\"' || charAt == '\'') {
            this.f31755g = charAt;
        } else if (charAt == '(') {
            this.f31755g = ')';
        }
        if (this.f31755g != 0) {
            this.f31749a = EnumC14393b.TITLE;
            this.f31756h = new StringBuilder();
            m1810m++;
            if (m1810m == charSequence.length()) {
                this.f31756h.append('\n');
            }
        } else {
            m1856b();
            this.f31749a = EnumC14393b.START_DEFINITION;
        }
        return m1810m;
    }

    /* renamed from: i */
    private int m1849i(CharSequence charSequence, int i) {
        int m1823e = C14410c.m1823e(charSequence, i, this.f31755g);
        if (m1823e == -1) {
            return -1;
        }
        this.f31756h.append(charSequence.subSequence(i, m1823e));
        if (m1823e >= charSequence.length()) {
            this.f31756h.append('\n');
            return m1823e;
        }
        int m1810m = C14411d.m1810m(charSequence, m1823e + 1, charSequence.length());
        if (m1810m != charSequence.length()) {
            return -1;
        }
        this.f31757i = true;
        m1856b();
        this.f31750b.setLength(0);
        this.f31749a = EnumC14393b.START_DEFINITION;
        return m1810m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C14426o> m1855c() {
        m1856b();
        return this.f31751c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence m1854d() {
        return this.f31750b;
    }

    /* renamed from: f */
    public void m1852f(CharSequence charSequence) {
        if (this.f31750b.length() != 0) {
            this.f31750b.append('\n');
        }
        this.f31750b.append(charSequence);
        int i = 0;
        while (i < charSequence.length()) {
            switch (C14392a.f31758a[this.f31749a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    i = m1851g(charSequence, i);
                    break;
                case 3:
                    i = m1853e(charSequence, i);
                    break;
                case 4:
                    i = m1857a(charSequence, i);
                    break;
                case 5:
                    i = m1850h(charSequence, i);
                    break;
                case 6:
                    i = m1849i(charSequence, i);
                    break;
            }
            if (i == -1) {
                this.f31749a = EnumC14393b.PARAGRAPH;
                return;
            }
        }
    }
}
