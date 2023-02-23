package p272h.p375g.p376a.p377g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9425a;
import p272h.p375g.p376a.p378h.AbstractC9442j;
import p577n.p587c.C14460c;
import p577n.p587c.InterfaceC14459b;
/* compiled from: CompositeField.java */
/* renamed from: h.g.a.g.a */
/* loaded from: classes2.dex */
public class C9431a implements InterfaceC9425a<C9431a> {

    /* renamed from: c */
    private static final InterfaceC14459b f22100c = C14460c.m1680f(C9431a.class);

    /* renamed from: a */
    private List<C9429e> f22101a;

    /* renamed from: b */
    private List<AbstractC9442j> f22102b;

    /* renamed from: e */
    public C9431a m14733e(AbstractC9442j abstractC9442j) {
        if (this.f22102b == null) {
            this.f22102b = new ArrayList(4);
        }
        this.f22102b.add(abstractC9442j);
        return this;
    }

    @Override // p272h.p375g.p376a.InterfaceC9425a
    /* renamed from: f */
    public C9431a mo14736b(byte[] bArr, int i, int i2) {
        int m14761c;
        ArrayList arrayList = new ArrayList(this.f22102b.size());
        try {
            int i3 = 0;
            for (AbstractC9442j abstractC9442j : this.f22102b) {
                C9429e<?> mo14709f = abstractC9442j.mo14709f(0, bArr, i3, null);
                if (mo14709f != null) {
                    if (mo14709f.m14760d() != EnumC9428d.NUMERIC && mo14709f.m14760d() != EnumC9428d.DATE10 && mo14709f.m14760d() != EnumC9428d.DATE4 && mo14709f.m14760d() != EnumC9428d.DATE_EXP && mo14709f.m14760d() != EnumC9428d.AMOUNT && mo14709f.m14760d() != EnumC9428d.TIME) {
                        m14761c = mo14709f.m14761c();
                        i3 += m14761c;
                        if (mo14709f.m14760d() != EnumC9428d.LLVAR && mo14709f.m14760d() != EnumC9428d.LLBIN) {
                            if (mo14709f.m14760d() != EnumC9428d.LLLVAR || mo14709f.m14760d() == EnumC9428d.LLLBIN) {
                                i3 += 2;
                            }
                            arrayList.add(mo14709f);
                        }
                        i3++;
                        arrayList.add(mo14709f);
                    }
                    m14761c = (mo14709f.m14761c() / 2) + (mo14709f.m14761c() % 2);
                    i3 += m14761c;
                    if (mo14709f.m14760d() != EnumC9428d.LLVAR) {
                        if (mo14709f.m14760d() != EnumC9428d.LLLVAR) {
                        }
                        i3 += 2;
                        arrayList.add(mo14709f);
                    }
                    i3++;
                    arrayList.add(mo14709f);
                }
            }
            C9431a c9431a = new C9431a();
            c9431a.m14727k(arrayList);
            return c9431a;
        } catch (UnsupportedEncodingException e) {
            f22100c.mo1644c("Decoding binary CompositeField", e);
            return null;
        } catch (ParseException e2) {
            f22100c.mo1644c("Decoding binary CompositeField", e2);
            return null;
        }
    }

    @Override // p272h.p375g.p376a.InterfaceC9426b
    /* renamed from: g */
    public C9431a mo14737a(String str) {
        ArrayList arrayList = new ArrayList(this.f22102b.size());
        byte[] bytes = str.getBytes();
        try {
            int i = 0;
            for (AbstractC9442j abstractC9442j : this.f22102b) {
                C9429e<?> mo14710e = abstractC9442j.mo14710e(0, bytes, i, null);
                if (mo14710e != null) {
                    i += mo14710e.toString().getBytes(abstractC9442j.m14716b()).length;
                    if (mo14710e.m14760d() != EnumC9428d.LLVAR && mo14710e.m14760d() != EnumC9428d.LLBIN) {
                        if (mo14710e.m14760d() == EnumC9428d.LLLVAR || mo14710e.m14760d() == EnumC9428d.LLLBIN) {
                            i += 3;
                        }
                        arrayList.add(mo14710e);
                    }
                    i += 2;
                    arrayList.add(mo14710e);
                }
            }
            C9431a c9431a = new C9431a();
            c9431a.m14727k(arrayList);
            return c9431a;
        } catch (UnsupportedEncodingException e) {
            f22100c.mo1644c("Decoding CompositeField", e);
            return null;
        } catch (ParseException e2) {
            f22100c.mo1644c("Decoding CompositeField", e2);
            return null;
        }
    }

    @Override // p272h.p375g.p376a.InterfaceC9425a
    /* renamed from: h */
    public byte[] mo14735c(C9431a c9431a) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            for (C9429e c9429e : c9431a.m14728j()) {
                c9429e.m14757g(byteArrayOutputStream, true, true);
            }
        } catch (IOException e) {
            f22100c.mo1644c("Encoding binary CompositeField", e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p272h.p375g.p376a.InterfaceC9426b
    /* renamed from: i */
    public String mo14734d(C9431a c9431a) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = null;
        try {
            String str = null;
            for (C9429e c9429e : c9431a.m14728j()) {
                c9429e.m14757g(byteArrayOutputStream, false, true);
                if (str == null) {
                    str = c9429e.m14762b();
                }
            }
            bArr = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str = "UTF-8";
            }
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            f22100c.mo1644c("Encoding text CompositeField", e);
            return new String(bArr);
        } catch (IOException e2) {
            f22100c.mo1644c("Encoding text CompositeField", e2);
            return new String(bArr);
        }
    }

    /* renamed from: j */
    public List<C9429e> m14728j() {
        return this.f22101a;
    }

    /* renamed from: k */
    public void m14727k(List<C9429e> list) {
        this.f22101a = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CompositeField[");
        List<C9429e> list = this.f22101a;
        if (list != null) {
            boolean z = true;
            for (C9429e c9429e : list) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(c9429e.m14760d());
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
