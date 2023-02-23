package com.hwangjr.rxbus;

import com.hwangjr.rxbus.entity.EventType;
import com.hwangjr.rxbus.entity.ProducerEvent;
import com.hwangjr.rxbus.entity.SubscriberEvent;
import com.hwangjr.rxbus.finder.Finder;
import com.hwangjr.rxbus.p189annotation.Excludes;
import com.hwangjr.rxbus.thread.ThreadEnforcer;
import j.e.e0.e;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.p450e0.Object;
/* loaded from: classes.dex */
public class Bus {
    public static final String DEFAULT_IDENTIFIER = "default";
    private final ThreadEnforcer enforcer;
    private final Finder finder;
    private final ConcurrentMap<Class<?>, Set<Class<?>>> flattenHierarchyCache;
    private final String identifier;
    private final ConcurrentMap<EventType, ProducerEvent> producersByType;
    private final ConcurrentMap<EventType, Set<SubscriberEvent>> subscribersByType;

    public Bus() {
        this("default");
    }

    public Bus(ThreadEnforcer threadEnforcer) {
        this(threadEnforcer, "default");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Bus(com.hwangjr.rxbus.thread.ThreadEnforcer r2, java.lang.String r3) {
        /*
            r1 = this;
            com.hwangjr.rxbus.finder.Finder r0 = com.hwangjr.rxbus.finder.Finder.ANNOTATED
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwangjr.rxbus.Bus.<init>(com.hwangjr.rxbus.thread.ThreadEnforcer, java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    Bus(ThreadEnforcer threadEnforcer, String str, Finder finder) {
        ConcurrentHashMap $r4 = new ConcurrentHashMap();
        this.subscribersByType = $r4;
        ConcurrentHashMap $r42 = new ConcurrentHashMap();
        this.producersByType = $r42;
        ConcurrentHashMap $r43 = new ConcurrentHashMap();
        this.flattenHierarchyCache = $r43;
        this.enforcer = threadEnforcer;
        this.identifier = str;
        this.finder = finder;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Bus(java.lang.String r2) {
        /*
            r1 = this;
            com.hwangjr.rxbus.thread.ThreadEnforcer r0 = com.hwangjr.rxbus.thread.ThreadEnforcer.MAIN
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwangjr.rxbus.Bus.<init>(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void dispatchProducerResult(final SubscriberEvent subscriberEvent, ProducerEvent producerEvent) {
        AbstractC11293f $r3 = producerEvent.produce();
        Object r6 = (Object) new e() { // from class: com.hwangjr.rxbus.Bus.1
            public void accept(Object obj) {
                if (obj != null) {
                    Bus.this.dispatch(obj, subscriberEvent);
                }
            }
        };
        $r3.H(r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Set getClassesFor(java.lang.Class r7) {
        /*
            r6 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.add(r7)
        Ld:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L29
            r4 = 0
            java.lang.Object r3 = r0.remove(r4)
            r5 = r3
            java.lang.Class r5 = (java.lang.Class) r5
            r7 = r5
            r1.add(r7)
            java.lang.Class r7 = r7.getSuperclass()
            if (r7 == 0) goto Ld
            r0.add(r7)
            goto Ld
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwangjr.rxbus.Bus.getClassesFor(java.lang.Class):java.util.Set");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    protected void dispatch(Object obj, SubscriberEvent subscriberEvent) {
        boolean $z0 = subscriberEvent.isValid();
        if ($z0) {
            subscriberEvent.handle(obj);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    Set flattenHierarchy(Class cls) {
        ConcurrentMap $r1 = this.flattenHierarchyCache;
        Object $r3 = $r1.get(cls);
        Set $r4 = (Set) $r3;
        if ($r4 == null) {
            Set $r42 = getClassesFor(cls);
            ConcurrentMap $r12 = this.flattenHierarchyCache;
            Object $r32 = $r12.putIfAbsent(cls, $r42);
            Set $r5 = (Set) $r32;
            return $r5 == null ? $r42 : $r5;
        }
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    ProducerEvent getProducerForEventType(EventType eventType) {
        ConcurrentMap $r1 = this.producersByType;
        Object $r2 = $r1.get(eventType);
        ProducerEvent $r4 = (ProducerEvent) $r2;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    Set getSubscribersForEventType(EventType eventType) {
        ConcurrentMap $r1 = this.subscribersByType;
        Object $r2 = $r1.get(eventType);
        Set $r4 = (Set) $r2;
        return $r4;
    }

    public void post(Object obj) {
        post(Excludes.DEFAULT, obj);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0048 */
    /* JADX WARN: Incorrect condition in loop: B:5:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void post(java.lang.String r18, java.lang.Object r19) {
        /*
            r17 = this;
            if (r19 == 0) goto L71
            r0 = r17
            com.hwangjr.rxbus.thread.ThreadEnforcer r2 = r0.enforcer
            r0 = r17
            r2.enforce(r0)
            r0 = r19
            java.lang.Class r3 = r0.getClass()
            r0 = r17
            java.util.Set r4 = r0.flattenHierarchy(r3)
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L1c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r8 = r6.next()
            r9 = r8
            java.lang.Class r9 = (java.lang.Class) r9
            r3 = r9
            com.hwangjr.rxbus.entity.EventType r10 = new com.hwangjr.rxbus.entity.EventType
            r0 = r18
            r10.<init>(r0, r3)
            r0 = r17
            java.util.Set r4 = r0.getSubscribersForEventType(r10)
            if (r4 == 0) goto L1c
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L1c
            r5 = 1
            java.util.Iterator r11 = r4.iterator()
        L44:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L1c
            java.lang.Object r8 = r11.next()
            r13 = r8
            com.hwangjr.rxbus.entity.SubscriberEvent r13 = (com.hwangjr.rxbus.entity.SubscriberEvent) r13
            r12 = r13
            r0 = r17
            r1 = r19
            r0.dispatch(r1, r12)
            goto L44
        L5a:
            if (r5 != 0) goto L7c
            r0 = r19
            boolean r5 = r0 instanceof com.hwangjr.rxbus.entity.DeadEvent
            if (r5 != 0) goto L7c
            com.hwangjr.rxbus.entity.DeadEvent r14 = new com.hwangjr.rxbus.entity.DeadEvent
            r0 = r17
            r1 = r19
            r14.<init>(r0, r1)
            r0 = r17
            r0.post(r14)
            return
        L71:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException
            java.lang.String r16 = "Event to post must not be null."
            r0 = r16
            r15.<init>(r0)
            goto L7b
        L7b:
            throw r15
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwangjr.rxbus.Bus.post(java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:14:0x0061 */
    /* JADX WARN: Incorrect condition in loop: B:20:0x00f1 */
    /* JADX WARN: Incorrect condition in loop: B:34:0x0158 */
    /* JADX WARN: Incorrect condition in loop: B:41:0x019c */
    /* JADX WARN: Incorrect condition in loop: B:5:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void register(java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwangjr.rxbus.Bus.register(java.lang.Object):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("[Bus \"");
        String $r1 = this.identifier;
        $r2.append($r1);
        $r2.append("\"]");
        String $r12 = $r2.toString();
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:15:0x00a9 */
    /* JADX WARN: Incorrect condition in loop: B:22:0x00e3 */
    /* JADX WARN: Incorrect condition in loop: B:5:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void unregister(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwangjr.rxbus.Bus.unregister(java.lang.Object):void");
    }
}
