package io.intercom.com.google.gson.p418t;

import io.intercom.com.google.gson.InterfaceC10923f;
import io.intercom.com.google.gson.JsonIOException;
import io.intercom.com.google.gson.p418t.p421o.AbstractC11056b;
import io.intercom.com.google.gson.p422u.C11058a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* compiled from: ConstructorConstructor.java */
/* renamed from: io.intercom.com.google.gson.t.c */
/* loaded from: classes3.dex */
public final class C10948c {

    /* renamed from: a */
    private final Map<Type, InterfaceC10923f<?>> f24945a;

    /* renamed from: b */
    private final AbstractC11056b f24946b = AbstractC11056b.m11666a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$a */
    /* loaded from: classes3.dex */
    public class C10949a implements InterfaceC10976i<T> {
        C10949a(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$b */
    /* loaded from: classes3.dex */
    public class C10950b implements InterfaceC10976i<T> {
        C10950b(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$c */
    /* loaded from: classes3.dex */
    public class C10951c implements InterfaceC10976i<T> {
        C10951c(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$d */
    /* loaded from: classes3.dex */
    public class C10952d implements InterfaceC10976i<T> {
        C10952d(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, io.intercom.com.google.gson.t.h] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new C10968h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$e */
    /* loaded from: classes3.dex */
    public class C10953e implements InterfaceC10976i<T> {

        /* renamed from: a */
        private final AbstractC10982m f24947a = AbstractC10982m.m11797b();

        /* renamed from: b */
        final /* synthetic */ Class f24948b;

        /* renamed from: c */
        final /* synthetic */ Type f24949c;

        C10953e(C10948c c10948c, Class cls, Type type) {
            this.f24948b = cls;
            this.f24949c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            try {
                return this.f24947a.mo11796c(this.f24948b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f24949c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$f */
    /* loaded from: classes3.dex */
    class C10954f implements InterfaceC10976i<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10923f f24950a;

        /* renamed from: b */
        final /* synthetic */ Type f24951b;

        C10954f(C10948c c10948c, InterfaceC10923f interfaceC10923f, Type type) {
            this.f24950a = interfaceC10923f;
            this.f24951b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return this.f24950a.m11934a(this.f24951b);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$g */
    /* loaded from: classes3.dex */
    class C10955g implements InterfaceC10976i<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10923f f24952a;

        /* renamed from: b */
        final /* synthetic */ Type f24953b;

        C10955g(C10948c c10948c, InterfaceC10923f interfaceC10923f, Type type) {
            this.f24952a = interfaceC10923f;
            this.f24953b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return this.f24952a.m11934a(this.f24953b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$h */
    /* loaded from: classes3.dex */
    public class C10956h implements InterfaceC10976i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f24954a;

        C10956h(C10948c c10948c, Constructor constructor) {
            this.f24954a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            try {
                return this.f24954a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.f24954a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.f24954a + " with no args", e3.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$i */
    /* loaded from: classes3.dex */
    public class C10957i implements InterfaceC10976i<T> {
        C10957i(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$j */
    /* loaded from: classes3.dex */
    public class C10958j implements InterfaceC10976i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f24955a;

        C10958j(C10948c c10948c, Type type) {
            this.f24955a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            Type type = this.f24955a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f24955a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f24955a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$k */
    /* loaded from: classes3.dex */
    public class C10959k implements InterfaceC10976i<T> {
        C10959k(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$l */
    /* loaded from: classes3.dex */
    public class C10960l implements InterfaceC10976i<T> {
        C10960l(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$m */
    /* loaded from: classes3.dex */
    public class C10961m implements InterfaceC10976i<T> {
        C10961m(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: io.intercom.com.google.gson.t.c$n */
    /* loaded from: classes3.dex */
    public class C10962n implements InterfaceC10976i<T> {
        C10962n(C10948c c10948c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // io.intercom.com.google.gson.p418t.InterfaceC10976i
        /* renamed from: a */
        public T mo11808a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C10948c(Map<Type, InterfaceC10923f<?>> map) {
        this.f24945a = map;
    }

    /* renamed from: b */
    private <T> InterfaceC10976i<T> m11845b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f24946b.mo11665b(declaredConstructor);
            }
            return new C10956h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> InterfaceC10976i<T> m11844c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C10957i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C10958j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C10959k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C10960l(this);
            }
            return new C10961m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C10962n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C10949a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C10950b(this);
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(C11058a.m11660b(((ParameterizedType) type).getActualTypeArguments()[0]).m11659c())) {
                return new C10951c(this);
            }
            return new C10952d(this);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    private <T> InterfaceC10976i<T> m11843d(Type type, Class<? super T> cls) {
        return new C10953e(this, cls, type);
    }

    /* renamed from: a */
    public <T> InterfaceC10976i<T> m11846a(C11058a<T> c11058a) {
        Type m11657e = c11058a.m11657e();
        Class<? super T> m11659c = c11058a.m11659c();
        InterfaceC10923f<?> interfaceC10923f = this.f24945a.get(m11657e);
        if (interfaceC10923f != null) {
            return new C10954f(this, interfaceC10923f, m11657e);
        }
        InterfaceC10923f<?> interfaceC10923f2 = this.f24945a.get(m11659c);
        if (interfaceC10923f2 != null) {
            return new C10955g(this, interfaceC10923f2, m11657e);
        }
        InterfaceC10976i<T> m11845b = m11845b(m11659c);
        if (m11845b != null) {
            return m11845b;
        }
        InterfaceC10976i<T> m11844c = m11844c(m11657e, m11659c);
        return m11844c != null ? m11844c : m11843d(m11657e, m11659c);
    }

    public String toString() {
        return this.f24945a.toString();
    }
}
