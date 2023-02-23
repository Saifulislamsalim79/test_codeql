package p577n.p578a.p579a;

import java.util.regex.Pattern;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.C14421j;
import p577n.p578a.p582b.C14431t;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.AbstractC14446b;
import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14451g;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: HtmlBlockParser.java */
/* renamed from: n.a.a.k */
/* loaded from: classes3.dex */
public class C14383k extends AbstractC14445a {

    /* renamed from: e */
    private static final Pattern[][] f31717e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: a */
    private final C14421j f31718a;

    /* renamed from: b */
    private final Pattern f31719b;

    /* renamed from: c */
    private boolean f31720c;

    /* renamed from: d */
    private C14369a f31721d;

    /* compiled from: HtmlBlockParser.java */
    /* renamed from: n.a.a.k$b */
    /* loaded from: classes3.dex */
    public static class C14385b extends AbstractC14446b {
        @Override // p577n.p578a.p583c.p584f.InterfaceC14449e
        /* renamed from: a */
        public AbstractC14450f mo1714a(InterfaceC14452h interfaceC14452h, InterfaceC14451g interfaceC14451g) {
            int mo1703d = interfaceC14452h.mo1703d();
            CharSequence mo1704c = interfaceC14452h.mo1704c();
            if (interfaceC14452h.mo1705b() < 4 && mo1704c.charAt(mo1703d) == '<') {
                for (int i = 1; i <= 7; i++) {
                    if (i != 7 || !(interfaceC14451g.mo1708a().mo1716g() instanceof C14431t)) {
                        Pattern pattern = C14383k.f31717e[i][0];
                        Pattern pattern2 = C14383k.f31717e[i][1];
                        if (pattern.matcher(mo1704c.subSequence(mo1703d, mo1704c.length())).find()) {
                            AbstractC14450f m1710d = AbstractC14450f.m1710d(new C14383k(pattern2));
                            m1710d.mo1712b(interfaceC14452h.mo1700h());
                            return m1710d;
                        }
                    }
                }
            }
            return AbstractC14450f.m1711c();
        }
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        if (this.f31720c) {
            return C14447c.m1723d();
        }
        if (interfaceC14452h.mo1706a() && this.f31719b == null) {
            return C14447c.m1723d();
        }
        return C14447c.m1725b(interfaceC14452h.mo1700h());
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: e */
    public void mo1718e() {
        this.f31718a.m1791n(this.f31721d.m1938b());
        this.f31721d = null;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: g */
    public AbstractC14412a mo1716g() {
        return this.f31718a;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: h */
    public void mo1715h(CharSequence charSequence) {
        this.f31721d.m1939a(charSequence);
        Pattern pattern = this.f31719b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f31720c = true;
    }

    private C14383k(Pattern pattern) {
        this.f31718a = new C14421j();
        this.f31720c = false;
        this.f31721d = new C14369a();
        this.f31719b = pattern;
    }
}
