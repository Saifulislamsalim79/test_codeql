package com.google.gson.internal.bind;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6915t;
import com.google.gson.internal.C6876g;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends AbstractC6909s<Object> {

    /* renamed from: b */
    public static final InterfaceC6915t f16383b = new InterfaceC6915t() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.InterfaceC6915t
        /* renamed from: a */
        public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
            if (c6916a.getRawType() == Object.class) {
                return new ObjectTypeAdapter(c6784f);
            }
            return null;
        }
    };

    /* renamed from: a */
    private final C6784f f16384a;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6805a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16385a;

        static {
            int[] iArr = new int[EnumC6913b.values().length];
            f16385a = iArr;
            try {
                iArr[EnumC6913b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16385a[EnumC6913b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16385a[EnumC6913b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16385a[EnumC6913b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16385a[EnumC6913b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16385a[EnumC6913b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    ObjectTypeAdapter(C6784f c6784f) {
        this.f16384a = c6784f;
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: b */
    public Object mo20528b(C6911a c6911a) throws IOException {
        switch (C6805a.f16385a[c6911a.mo20525C0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c6911a.mo20504c();
                while (c6911a.mo20509V()) {
                    arrayList.add(mo20528b(c6911a));
                }
                c6911a.mo20518J();
                return arrayList;
            case 2:
                C6876g c6876g = new C6876g();
                c6911a.mo20502g();
                while (c6911a.mo20509V()) {
                    c6876g.put(c6911a.mo20497o0(), mo20528b(c6911a));
                }
                c6911a.mo20514O();
                return c6876g;
            case 3:
                return c6911a.mo20493z0();
            case 4:
                return Double.valueOf(c6911a.mo20501g0());
            case 5:
                return Boolean.valueOf(c6911a.mo20503f0());
            case 6:
                c6911a.mo20495w0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: d */
    public void mo20527d(C6914c c6914c, Object obj) throws IOException {
        if (obj == null) {
            c6914c.mo20474f0();
            return;
        }
        AbstractC6909s m20757o = this.f16384a.m20757o(obj.getClass());
        if (m20757o instanceof ObjectTypeAdapter) {
            c6914c.mo20487F();
            c6914c.mo20481O();
            return;
        }
        m20757o.mo20527d(c6914c, obj);
    }
}
