package p425j.p429b.p430a.p431a.p432a;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: Bus.java */
/* renamed from: j.b.a.a.a.b */
/* loaded from: classes3.dex */
public class C11129b {
    public static final String DEFAULT_IDENTIFIER = "default";
    private final InterfaceC11138i enforcer;
    private final ThreadLocal<ConcurrentLinkedQueue<C11132c>> eventsToDispatch;
    private final ConcurrentMap<Class<?>, Set<Class<?>>> flattenHierarchyCache;
    private final InterfaceC11136f handlerFinder;
    private final ConcurrentMap<Class<?>, Set<C11134d>> handlersByType;
    private final String identifier;
    private final ThreadLocal<Boolean> isDispatching;
    private final ConcurrentMap<Class<?>, C11135e> producersByType;

    /* compiled from: Bus.java */
    /* renamed from: j.b.a.a.a.b$a */
    /* loaded from: classes3.dex */
    class C11130a extends ThreadLocal<ConcurrentLinkedQueue<C11132c>> {
        C11130a(C11129b c11129b) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ConcurrentLinkedQueue<C11132c> initialValue() {
            return new ConcurrentLinkedQueue<>();
        }
    }

    /* compiled from: Bus.java */
    /* renamed from: j.b.a.a.a.b$b */
    /* loaded from: classes3.dex */
    class C11131b extends ThreadLocal<Boolean> {
        C11131b(C11129b c11129b) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Bus.java */
    /* renamed from: j.b.a.a.a.b$c */
    /* loaded from: classes3.dex */
    public static class C11132c {

        /* renamed from: a */
        final Object f25184a;

        /* renamed from: b */
        final C11134d f25185b;

        public C11132c(Object obj, C11134d c11134d) {
            this.f25184a = obj;
            this.f25185b = c11134d;
        }
    }

    public C11129b() {
        this("default");
    }

    private void dispatchProducerResultToHandler(C11134d c11134d, C11135e c11135e) {
        Object obj;
        try {
            obj = c11135e.m11590c();
        } catch (InvocationTargetException e) {
            throwRuntimeException("Producer " + c11135e + " threw an exception.", e);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        dispatch(obj, c11134d);
    }

    private Set<Class<?>> getClassesFor(Class<?> cls) {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(cls);
        while (!linkedList.isEmpty()) {
            Class cls2 = (Class) linkedList.remove(0);
            hashSet.add(cls2);
            Class superclass = cls2.getSuperclass();
            if (superclass != null) {
                linkedList.add(superclass);
            }
        }
        return hashSet;
    }

    private static void throwRuntimeException(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            throw new RuntimeException(str + ": " + cause.getMessage(), cause);
        }
        throw new RuntimeException(str + ": " + invocationTargetException.getMessage(), invocationTargetException);
    }

    protected void dispatch(Object obj, C11134d c11134d) {
        try {
            c11134d.m11595a(obj);
        } catch (InvocationTargetException e) {
            throwRuntimeException("Could not dispatch event: " + obj.getClass() + " to handler " + c11134d, e);
        }
    }

    protected void dispatchQueuedEvents() {
        if (this.isDispatching.get().booleanValue()) {
            return;
        }
        this.isDispatching.set(Boolean.TRUE);
        while (true) {
            try {
                C11132c poll = this.eventsToDispatch.get().poll();
                if (poll == null) {
                    return;
                }
                if (poll.f25185b.m11593c()) {
                    dispatch(poll.f25184a, poll.f25185b);
                }
            } finally {
                this.isDispatching.set(Boolean.FALSE);
            }
        }
    }

    protected void enqueueEvent(Object obj, C11134d c11134d) {
        this.eventsToDispatch.get().offer(new C11132c(obj, c11134d));
    }

    Set<Class<?>> flattenHierarchy(Class<?> cls) {
        Set<Class<?>> set = this.flattenHierarchyCache.get(cls);
        if (set == null) {
            Set<Class<?>> classesFor = getClassesFor(cls);
            Set<Class<?>> putIfAbsent = this.flattenHierarchyCache.putIfAbsent(cls, classesFor);
            return putIfAbsent == null ? classesFor : putIfAbsent;
        }
        return set;
    }

    Set<C11134d> getHandlersForEventType(Class<?> cls) {
        return this.handlersByType.get(cls);
    }

    C11135e getProducerForEventType(Class<?> cls) {
        return this.producersByType.get(cls);
    }

    public void post(Object obj) {
        if (obj != null) {
            this.enforcer.mo11589a(this);
            boolean z = false;
            for (Class<?> cls : flattenHierarchy(obj.getClass())) {
                Set<C11134d> handlersForEventType = getHandlersForEventType(cls);
                if (handlersForEventType != null && !handlersForEventType.isEmpty()) {
                    z = true;
                    for (C11134d c11134d : handlersForEventType) {
                        enqueueEvent(obj, c11134d);
                    }
                }
            }
            if (!z && !(obj instanceof C11133c)) {
                post(new C11133c(this, obj));
            }
            dispatchQueuedEvents();
            return;
        }
        throw new NullPointerException("Event to post must not be null.");
    }

    public void register(Object obj) {
        Set<C11134d> putIfAbsent;
        if (obj != null) {
            this.enforcer.mo11589a(this);
            Map<Class<?>, C11135e> findAllProducers = this.handlerFinder.findAllProducers(obj);
            for (Class<?> cls : findAllProducers.keySet()) {
                C11135e c11135e = findAllProducers.get(cls);
                C11135e putIfAbsent2 = this.producersByType.putIfAbsent(cls, c11135e);
                if (putIfAbsent2 == null) {
                    Set<C11134d> set = this.handlersByType.get(cls);
                    if (set != null && !set.isEmpty()) {
                        for (C11134d c11134d : set) {
                            dispatchProducerResultToHandler(c11134d, c11135e);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Producer method for type " + cls + " found on type " + c11135e.f25192a.getClass() + ", but already registered by type " + putIfAbsent2.f25192a.getClass() + ".");
                }
            }
            Map<Class<?>, Set<C11134d>> findAllSubscribers = this.handlerFinder.findAllSubscribers(obj);
            for (Class<?> cls2 : findAllSubscribers.keySet()) {
                Set<C11134d> set2 = this.handlersByType.get(cls2);
                if (set2 == null && (putIfAbsent = this.handlersByType.putIfAbsent(cls2, (set2 = new CopyOnWriteArraySet<>()))) != null) {
                    set2 = putIfAbsent;
                }
                if (!set2.addAll(findAllSubscribers.get(cls2))) {
                    throw new IllegalArgumentException("Object already registered.");
                }
            }
            for (Map.Entry<Class<?>, Set<C11134d>> entry : findAllSubscribers.entrySet()) {
                C11135e c11135e2 = this.producersByType.get(entry.getKey());
                if (c11135e2 != null && c11135e2.m11591b()) {
                    for (C11134d c11134d2 : entry.getValue()) {
                        if (!c11135e2.m11591b()) {
                            break;
                        } else if (c11134d2.m11593c()) {
                            dispatchProducerResultToHandler(c11134d2, c11135e2);
                        }
                    }
                }
            }
            return;
        }
        throw new NullPointerException("Object to register must not be null.");
    }

    public String toString() {
        return "[Bus \"" + this.identifier + "\"]";
    }

    public void unregister(Object obj) {
        if (obj != null) {
            this.enforcer.mo11589a(this);
            for (Map.Entry<Class<?>, C11135e> entry : this.handlerFinder.findAllProducers(obj).entrySet()) {
                Class<?> key = entry.getKey();
                C11135e producerForEventType = getProducerForEventType(key);
                C11135e value = entry.getValue();
                if (value != null && value.equals(producerForEventType)) {
                    this.producersByType.remove(key).m11592a();
                } else {
                    throw new IllegalArgumentException("Missing event producer for an annotated method. Is " + obj.getClass() + " registered?");
                }
            }
            for (Map.Entry<Class<?>, Set<C11134d>> entry2 : this.handlerFinder.findAllSubscribers(obj).entrySet()) {
                Set<C11134d> handlersForEventType = getHandlersForEventType(entry2.getKey());
                Set<C11134d> value2 = entry2.getValue();
                if (handlersForEventType != null && handlersForEventType.containsAll(value2)) {
                    for (C11134d c11134d : handlersForEventType) {
                        if (value2.contains(c11134d)) {
                            c11134d.m11594b();
                        }
                    }
                    handlersForEventType.removeAll(value2);
                } else {
                    throw new IllegalArgumentException("Missing event handler for an annotated method. Is " + obj.getClass() + " registered?");
                }
            }
            return;
        }
        throw new NullPointerException("Object to unregister must not be null.");
    }

    public C11129b(String str) {
        this(InterfaceC11138i.f25198b, str);
    }

    public C11129b(InterfaceC11138i interfaceC11138i) {
        this(interfaceC11138i, "default");
    }

    public C11129b(InterfaceC11138i interfaceC11138i, String str) {
        this(interfaceC11138i, str, InterfaceC11136f.f25196a);
    }

    C11129b(InterfaceC11138i interfaceC11138i, String str, InterfaceC11136f interfaceC11136f) {
        this.handlersByType = new ConcurrentHashMap();
        this.producersByType = new ConcurrentHashMap();
        this.eventsToDispatch = new C11130a(this);
        this.isDispatching = new C11131b(this);
        this.flattenHierarchyCache = new ConcurrentHashMap();
        this.enforcer = interfaceC11138i;
        this.identifier = str;
        this.handlerFinder = interfaceC11136f;
    }
}
