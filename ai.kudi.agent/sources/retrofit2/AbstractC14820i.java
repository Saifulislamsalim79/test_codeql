package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import p565l.AbstractC14120b0;
import p565l.C14229s;
import p565l.C14236w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ParameterHandler.java */
/* renamed from: retrofit2.i */
/* loaded from: classes3.dex */
public abstract class AbstractC14820i<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$a */
    /* loaded from: classes3.dex */
    public class C14821a extends AbstractC14820i<Iterable<T>> {
        C14821a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC14820i
        /* renamed from: d */
        public void mo302a(C14838k c14838k, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            for (T t : iterable) {
                AbstractC14820i.this.mo302a(c14838k, t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$b */
    /* loaded from: classes3.dex */
    public class C14822b extends AbstractC14820i<Object> {
        C14822b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.AbstractC14820i
        /* renamed from: a */
        void mo302a(C14838k c14838k, Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                AbstractC14820i.this.mo302a(c14838k, Array.get(obj, i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$c */
    /* loaded from: classes3.dex */
    public static final class C14823c<T> extends AbstractC14820i<T> {

        /* renamed from: a */
        private final InterfaceC14805e<T, AbstractC14120b0> f33108a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14823c(InterfaceC14805e<T, AbstractC14120b0> interfaceC14805e) {
            this.f33108a = interfaceC14805e;
        }

        @Override // retrofit2.AbstractC14820i
        /* renamed from: a */
        void mo302a(C14838k c14838k, T t) {
            if (t != null) {
                try {
                    c14838k.m285j(this.f33108a.convert(t));
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            }
            throw new IllegalArgumentException("Body parameter value must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$d */
    /* loaded from: classes3.dex */
    public static final class C14824d<T> extends AbstractC14820i<T> {

        /* renamed from: a */
        private final String f33109a;

        /* renamed from: b */
        private final InterfaceC14805e<T, String> f33110b;

        /* renamed from: c */
        private final boolean f33111c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14824d(String str, InterfaceC14805e<T, String> interfaceC14805e, boolean z) {
            C14846o.m239b(str, "name == null");
            this.f33109a = str;
            this.f33110b = interfaceC14805e;
            this.f33111c = z;
        }

        @Override // retrofit2.AbstractC14820i
        /* renamed from: a */
        void mo302a(C14838k c14838k, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f33110b.convert(t)) == null) {
                return;
            }
            c14838k.m294a(this.f33109a, convert, this.f33111c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$e */
    /* loaded from: classes3.dex */
    public static final class C14825e<T> extends AbstractC14820i<Map<String, T>> {

        /* renamed from: a */
        private final InterfaceC14805e<T, String> f33112a;

        /* renamed from: b */
        private final boolean f33113b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14825e(InterfaceC14805e<T, String> interfaceC14805e, boolean z) {
            this.f33112a = interfaceC14805e;
            this.f33113b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC14820i
        /* renamed from: d */
        public void mo302a(C14838k c14838k, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.f33112a.convert(value);
                            if (convert != null) {
                                c14838k.m294a(key, convert, this.f33113b);
                            } else {
                                throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.f33112a.getClass().getName() + " for key '" + key + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$f */
    /* loaded from: classes3.dex */
    public static final class C14826f<T> extends AbstractC14820i<T> {

        /* renamed from: a */
        private final String f33114a;

        /* renamed from: b */
        private final InterfaceC14805e<T, String> f33115b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14826f(String str, InterfaceC14805e<T, String> interfaceC14805e) {
            C14846o.m239b(str, "name == null");
            this.f33114a = str;
            this.f33115b = interfaceC14805e;
        }

        @Override // retrofit2.AbstractC14820i
        /* renamed from: a */
        void mo302a(C14838k c14838k, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f33115b.convert(t)) == null) {
                return;
            }
            c14838k.m293b(this.f33114a, convert);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$g */
    /* loaded from: classes3.dex */
    public static final class C14827g<T> extends AbstractC14820i<T> {

        /* renamed from: a */
        private final C14229s f33116a;

        /* renamed from: b */
        private final InterfaceC14805e<T, AbstractC14120b0> f33117b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14827g(C14229s c14229s, InterfaceC14805e<T, AbstractC14120b0> interfaceC14805e) {
            this.f33116a = c14229s;
            this.f33117b = interfaceC14805e;
        }

        @Override // retrofit2.AbstractC14820i
        /* renamed from: a */
        void mo302a(C14838k c14838k, T t) {
            if (t == null) {
                return;
            }
            try {
                c14838k.m292c(this.f33116a, this.f33117b.convert(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$h */
    /* loaded from: classes3.dex */
    public static final class C14828h<T> extends AbstractC14820i<Map<String, T>> {

        /* renamed from: a */
        private final InterfaceC14805e<T, AbstractC14120b0> f33118a;

        /* renamed from: b */
        private final String f33119b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14828h(InterfaceC14805e<T, AbstractC14120b0> interfaceC14805e, String str) {
            this.f33118a = interfaceC14805e;
            this.f33119b = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC14820i
        /* renamed from: d */
        public void mo302a(C14838k c14838k, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            c14838k.m292c(C14229s.m2546g("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f33119b), this.f33118a.convert(value));
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$i */
    /* loaded from: classes3.dex */
    public static final class C14829i<T> extends AbstractC14820i<T> {

        /* renamed from: a */
        private final String f33120a;

        /* renamed from: b */
        private final InterfaceC14805e<T, String> f33121b;

        /* renamed from: c */
        private final boolean f33122c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14829i(String str, InterfaceC14805e<T, String> interfaceC14805e, boolean z) {
            C14846o.m239b(str, "name == null");
            this.f33120a = str;
            this.f33121b = interfaceC14805e;
            this.f33122c = z;
        }

        @Override // retrofit2.AbstractC14820i
        /* renamed from: a */
        void mo302a(C14838k c14838k, T t) throws IOException {
            if (t != null) {
                c14838k.m290e(this.f33120a, this.f33121b.convert(t), this.f33122c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f33120a + "\" value must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$j */
    /* loaded from: classes3.dex */
    public static final class C14830j<T> extends AbstractC14820i<T> {

        /* renamed from: a */
        private final String f33123a;

        /* renamed from: b */
        private final InterfaceC14805e<T, String> f33124b;

        /* renamed from: c */
        private final boolean f33125c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14830j(String str, InterfaceC14805e<T, String> interfaceC14805e, boolean z) {
            C14846o.m239b(str, "name == null");
            this.f33123a = str;
            this.f33124b = interfaceC14805e;
            this.f33125c = z;
        }

        @Override // retrofit2.AbstractC14820i
        /* renamed from: a */
        void mo302a(C14838k c14838k, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f33124b.convert(t)) == null) {
                return;
            }
            c14838k.m289f(this.f33123a, convert, this.f33125c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$k */
    /* loaded from: classes3.dex */
    public static final class C14831k<T> extends AbstractC14820i<Map<String, T>> {

        /* renamed from: a */
        private final InterfaceC14805e<T, String> f33126a;

        /* renamed from: b */
        private final boolean f33127b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14831k(InterfaceC14805e<T, String> interfaceC14805e, boolean z) {
            this.f33126a = interfaceC14805e;
            this.f33127b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC14820i
        /* renamed from: d */
        public void mo302a(C14838k c14838k, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.f33126a.convert(value);
                            if (convert != null) {
                                c14838k.m289f(key, convert, this.f33127b);
                            } else {
                                throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.f33126a.getClass().getName() + " for key '" + key + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Query map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$l */
    /* loaded from: classes3.dex */
    public static final class C14832l<T> extends AbstractC14820i<T> {

        /* renamed from: a */
        private final InterfaceC14805e<T, String> f33128a;

        /* renamed from: b */
        private final boolean f33129b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14832l(InterfaceC14805e<T, String> interfaceC14805e, boolean z) {
            this.f33128a = interfaceC14805e;
            this.f33129b = z;
        }

        @Override // retrofit2.AbstractC14820i
        /* renamed from: a */
        void mo302a(C14838k c14838k, T t) throws IOException {
            if (t == null) {
                return;
            }
            c14838k.m289f(this.f33128a.convert(t), null, this.f33129b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParameterHandler.java */
    /* renamed from: retrofit2.i$m */
    /* loaded from: classes3.dex */
    public static final class C14833m extends AbstractC14820i<C14236w.C14238b> {

        /* renamed from: a */
        static final C14833m f33130a = new C14833m();

        private C14833m() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC14820i
        /* renamed from: d */
        public void mo302a(C14838k c14838k, C14236w.C14238b c14238b) {
            if (c14238b != null) {
                c14838k.m291d(c14238b);
            }
        }
    }

    AbstractC14820i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo302a(C14838k c14838k, T t) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC14820i<Object> m308b() {
        return new C14822b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC14820i<Iterable<T>> m307c() {
        return new C14821a();
    }
}
