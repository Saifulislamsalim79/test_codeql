package p201g.p227h.p235j;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import android.text.SpannableStringBuilder;
import java.util.Locale;
/* compiled from: BidiFormatter.java */
/* renamed from: g.h.j.a */
/* loaded from: classes2.dex */
public final class C7651a {

    /* renamed from: d */
    static final InterfaceC7658d f18351d = C7659e.f18383c;

    /* renamed from: e */
    private static final String f18352e = Character.toString(8206);

    /* renamed from: f */
    private static final String f18353f = Character.toString(8207);

    /* renamed from: g */
    static final C7651a f18354g = new C7651a(false, 2, f18351d);

    /* renamed from: h */
    static final C7651a f18355h = new C7651a(true, 2, f18351d);

    /* renamed from: a */
    private final boolean f18356a;

    /* renamed from: b */
    private final int f18357b;

    /* renamed from: c */
    private final InterfaceC7658d f18358c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: g.h.j.a$a */
    /* loaded from: classes2.dex */
    public static final class C7652a {

        /* renamed from: a */
        private boolean f18359a;

        /* renamed from: b */
        private int f18360b;

        /* renamed from: c */
        private InterfaceC7658d f18361c;

        public C7652a() {
            m17914c(C7651a.m17923e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C7651a m17915b(boolean z) {
            return z ? C7651a.f18355h : C7651a.f18354g;
        }

        /* renamed from: c */
        private void m17914c(boolean z) {
            this.f18359a = z;
            this.f18361c = C7651a.f18351d;
            this.f18360b = 2;
        }

        /* renamed from: a */
        public C7651a m17916a() {
            if (this.f18360b == 2 && this.f18361c == C7651a.f18351d) {
                return m17915b(this.f18359a);
            }
            return new C7651a(this.f18359a, this.f18360b, this.f18361c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidiFormatter.java */
    /* renamed from: g.h.j.a$b */
    /* loaded from: classes2.dex */
    public static class C7653b {

        /* renamed from: f */
        private static final byte[] f18362f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f18363a;

        /* renamed from: b */
        private final boolean f18364b;

        /* renamed from: c */
        private final int f18365c;

        /* renamed from: d */
        private int f18366d;

        /* renamed from: e */
        private char f18367e;

        static {
            for (int i = 0; i < 1792; i++) {
                f18362f[i] = Character.getDirectionality(i);
            }
        }

        C7653b(CharSequence charSequence, boolean z) {
            this.f18363a = charSequence;
            this.f18364b = z;
            this.f18365c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m17911c(char c) {
            return c < 1792 ? f18362f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m17908f() {
            char charAt;
            int i = this.f18366d;
            do {
                int i2 = this.f18366d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f18363a;
                int i3 = i2 - 1;
                this.f18366d = i3;
                charAt = charSequence.charAt(i3);
                this.f18367e = charAt;
                if (charAt == '&') {
                    return PrinterCommands.CONSTANT_NameAndType;
                }
            } while (charAt != ';');
            this.f18366d = i;
            this.f18367e = ';';
            return PrinterCommands.KING;
        }

        /* renamed from: g */
        private byte m17907g() {
            char charAt;
            do {
                int i = this.f18366d;
                if (i >= this.f18365c) {
                    return PrinterCommands.CONSTANT_NameAndType;
                }
                CharSequence charSequence = this.f18363a;
                this.f18366d = i + 1;
                charAt = charSequence.charAt(i);
                this.f18367e = charAt;
            } while (charAt != ';');
            return PrinterCommands.CONSTANT_NameAndType;
        }

        /* renamed from: h */
        private byte m17906h() {
            char charAt;
            int i = this.f18366d;
            while (true) {
                int i2 = this.f18366d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f18363a;
                int i3 = i2 - 1;
                this.f18366d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f18367e = charAt2;
                if (charAt2 == '<') {
                    return PrinterCommands.CONSTANT_NameAndType;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c = this.f18367e;
                    do {
                        int i4 = this.f18366d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f18363a;
                            int i5 = i4 - 1;
                            this.f18366d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f18367e = charAt;
                        }
                    } while (charAt != c);
                }
            }
            this.f18366d = i;
            this.f18367e = '>';
            return PrinterCommands.KING;
        }

        /* renamed from: i */
        private byte m17905i() {
            char charAt;
            int i = this.f18366d;
            while (true) {
                int i2 = this.f18366d;
                if (i2 < this.f18365c) {
                    CharSequence charSequence = this.f18363a;
                    this.f18366d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f18367e = charAt2;
                    if (charAt2 == '>') {
                        return PrinterCommands.CONSTANT_NameAndType;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c = this.f18367e;
                        do {
                            int i3 = this.f18366d;
                            if (i3 < this.f18365c) {
                                CharSequence charSequence2 = this.f18363a;
                                this.f18366d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.f18367e = charAt;
                            }
                        } while (charAt != c);
                    }
                } else {
                    this.f18366d = i;
                    this.f18367e = '<';
                    return PrinterCommands.KING;
                }
            }
        }

        /* renamed from: a */
        byte m17913a() {
            char charAt = this.f18363a.charAt(this.f18366d - 1);
            this.f18367e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f18363a, this.f18366d);
                this.f18366d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f18366d--;
            byte m17911c = m17911c(this.f18367e);
            if (this.f18364b) {
                char c = this.f18367e;
                if (c == '>') {
                    return m17906h();
                }
                return c == ';' ? m17908f() : m17911c;
            }
            return m17911c;
        }

        /* renamed from: b */
        byte m17912b() {
            char charAt = this.f18363a.charAt(this.f18366d);
            this.f18367e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f18363a, this.f18366d);
                this.f18366d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f18366d++;
            byte m17911c = m17911c(this.f18367e);
            if (this.f18364b) {
                char c = this.f18367e;
                if (c == '<') {
                    return m17905i();
                }
                return c == '&' ? m17907g() : m17911c;
            }
            return m17911c;
        }

        /* renamed from: d */
        int m17910d() {
            this.f18366d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f18366d < this.f18365c && i == 0) {
                byte m17912b = m17912b();
                if (m17912b != 0) {
                    if (m17912b == 1 || m17912b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (m17912b != 9) {
                        switch (m17912b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f18366d > 0) {
                switch (m17913a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        int m17909e() {
            this.f18366d = this.f18365c;
            int i = 0;
            int i2 = 0;
            while (this.f18366d > 0) {
                byte m17913a = m17913a();
                if (m17913a != 0) {
                    if (m17913a == 1 || m17913a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            i2 = i;
                        }
                    } else if (m17913a != 9) {
                        switch (m17913a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }
    }

    C7651a(boolean z, int i, InterfaceC7658d interfaceC7658d) {
        this.f18356a = z;
        this.f18357b = i;
        this.f18358c = interfaceC7658d;
    }

    /* renamed from: a */
    private static int m17927a(CharSequence charSequence) {
        return new C7653b(charSequence, false).m17910d();
    }

    /* renamed from: b */
    private static int m17926b(CharSequence charSequence) {
        return new C7653b(charSequence, false).m17909e();
    }

    /* renamed from: c */
    public static C7651a m17925c() {
        return new C7652a().m17916a();
    }

    /* renamed from: e */
    static boolean m17923e(Locale locale) {
        return C7666f.m17883b(locale) == 1;
    }

    /* renamed from: f */
    private String m17922f(CharSequence charSequence, InterfaceC7658d interfaceC7658d) {
        boolean mo17887a = interfaceC7658d.mo17887a(charSequence, 0, charSequence.length());
        if (this.f18356a || !(mo17887a || m17926b(charSequence) == 1)) {
            return this.f18356a ? (!mo17887a || m17926b(charSequence) == -1) ? f18353f : "" : "";
        }
        return f18352e;
    }

    /* renamed from: g */
    private String m17921g(CharSequence charSequence, InterfaceC7658d interfaceC7658d) {
        boolean mo17887a = interfaceC7658d.mo17887a(charSequence, 0, charSequence.length());
        if (this.f18356a || !(mo17887a || m17927a(charSequence) == 1)) {
            return this.f18356a ? (!mo17887a || m17927a(charSequence) == -1) ? f18353f : "" : "";
        }
        return f18352e;
    }

    /* renamed from: d */
    public boolean m17924d() {
        return (this.f18357b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m17920h(CharSequence charSequence) {
        return m17919i(charSequence, this.f18358c, true);
    }

    /* renamed from: i */
    public CharSequence m17919i(CharSequence charSequence, InterfaceC7658d interfaceC7658d, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean mo17887a = interfaceC7658d.mo17887a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m17924d() && z) {
            spannableStringBuilder.append((CharSequence) m17921g(charSequence, mo17887a ? C7659e.f18382b : C7659e.f18381a));
        }
        if (mo17887a != this.f18356a) {
            spannableStringBuilder.append(mo17887a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m17922f(charSequence, mo17887a ? C7659e.f18382b : C7659e.f18381a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m17918j(String str) {
        return m17917k(str, this.f18358c, true);
    }

    /* renamed from: k */
    public String m17917k(String str, InterfaceC7658d interfaceC7658d, boolean z) {
        if (str == null) {
            return null;
        }
        return m17919i(str, interfaceC7658d, z).toString();
    }
}
