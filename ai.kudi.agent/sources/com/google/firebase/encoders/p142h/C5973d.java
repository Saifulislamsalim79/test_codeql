package com.google.firebase.encoders.p142h;

import ai.kudi.agent.savings.adapter.SavingsAdapter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5960a;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.encoders.InterfaceC5966e;
import com.google.firebase.encoders.InterfaceC5967f;
import com.google.firebase.encoders.p141g.InterfaceC5968a;
import com.google.firebase.encoders.p141g.InterfaceC5969b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: JsonDataEncoderBuilder.java */
/* renamed from: com.google.firebase.encoders.h.d */
/* loaded from: classes2.dex */
public final class C5973d implements InterfaceC5969b<C5973d> {

    /* renamed from: e */
    private static final InterfaceC5964c<Object> f14613e = C5971b.f14611a;

    /* renamed from: f */
    private static final InterfaceC5966e<String> f14614f = C5970a.f14610a;

    /* renamed from: g */
    private static final InterfaceC5966e<Boolean> f14615g = C5972c.f14612a;

    /* renamed from: h */
    private static final C5975b f14616h = new C5975b(null);

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC5964c<?>> f14617a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC5966e<?>> f14618b = new HashMap();

    /* renamed from: c */
    private InterfaceC5964c<Object> f14619c = f14613e;

    /* renamed from: d */
    private boolean f14620d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: com.google.firebase.encoders.h.d$a */
    /* loaded from: classes2.dex */
    public class C5974a implements InterfaceC5960a {
        C5974a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5960a
        /* renamed from: a */
        public void mo23153a(Object obj, Writer writer) throws IOException {
            C5976e c5976e = new C5976e(writer, C5973d.this.f14617a, C5973d.this.f14618b, C5973d.this.f14619c, C5973d.this.f14620d);
            c5976e.m23147i(obj, false);
            c5976e.m23138r();
        }

        @Override // com.google.firebase.encoders.InterfaceC5960a
        /* renamed from: b */
        public String mo23152b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo23153a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: com.google.firebase.encoders.h.d$b */
    /* loaded from: classes2.dex */
    private static final class C5975b implements InterfaceC5966e<Date> {

        /* renamed from: a */
        private static final DateFormat f14622a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SavingsAdapter.SERVER_FORMAT, Locale.US);
            f14622a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C5975b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC5966e
        /* renamed from: b */
        public void mo23151a(Date date, InterfaceC5967f interfaceC5967f) throws IOException {
            interfaceC5967f.mo15764d(f14622a.format(date));
        }

        /* synthetic */ C5975b(C5974a c5974a) {
            this();
        }
    }

    public C5973d() {
        m23154m(String.class, f14614f);
        m23154m(Boolean.class, f14615g);
        m23154m(Date.class, f14616h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m23158i(Object obj, InterfaceC5965d interfaceC5965d) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.firebase.encoders.p141g.InterfaceC5969b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C5973d mo15833a(Class cls, InterfaceC5964c interfaceC5964c) {
        m23155l(cls, interfaceC5964c);
        return this;
    }

    /* renamed from: f */
    public InterfaceC5960a m23161f() {
        return new C5974a();
    }

    /* renamed from: g */
    public C5973d m23160g(InterfaceC5968a interfaceC5968a) {
        interfaceC5968a.mo15620a(this);
        return this;
    }

    /* renamed from: h */
    public C5973d m23159h(boolean z) {
        this.f14620d = z;
        return this;
    }

    /* renamed from: l */
    public <T> C5973d m23155l(Class<T> cls, InterfaceC5964c<? super T> interfaceC5964c) {
        this.f14617a.put(cls, interfaceC5964c);
        this.f14618b.remove(cls);
        return this;
    }

    /* renamed from: m */
    public <T> C5973d m23154m(Class<T> cls, InterfaceC5966e<? super T> interfaceC5966e) {
        this.f14618b.put(cls, interfaceC5966e);
        this.f14617a.remove(cls);
        return this;
    }
}
