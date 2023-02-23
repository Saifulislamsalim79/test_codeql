package com.hwangjr.rxbus.entity;

import com.hwangjr.rxbus.thread.EventThread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.EnumC11269a;
import p425j.p444e.InterfaceC11672h;
import p425j.p444e.InterfaceC11675i;
/* loaded from: classes2.dex */
public class ProducerEvent extends Event {
    private final int hashCode;
    private final Method method;
    private final Object target;
    private final EventThread thread;
    private boolean valid = true;

    public ProducerEvent(Object obj, Method method, EventThread eventThread) {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        }
        if (method != null) {
            this.target = obj;
            this.thread = eventThread;
            this.method = method;
            method.setAccessible(true);
            this.hashCode = ((method.hashCode() + 31) * 31) + obj.hashCode();
            return;
        }
        throw new NullPointerException("EventProducer method cannot be null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object produceEvent() throws InvocationTargetException {
        if (this.valid) {
            try {
                return this.method.invoke(this.target, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        }
        throw new IllegalStateException(toString() + " has been invalidated and can no longer produce events.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProducerEvent.class == obj.getClass()) {
            ProducerEvent producerEvent = (ProducerEvent) obj;
            return this.method.equals(producerEvent.method) && this.target == producerEvent.target;
        }
        return false;
    }

    public Object getTarget() {
        return this.target;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public void invalidate() {
        this.valid = false;
    }

    public boolean isValid() {
        return this.valid;
    }

    public AbstractC11293f produce() {
        return AbstractC11293f.m11179f(new InterfaceC11675i() { // from class: com.hwangjr.rxbus.entity.ProducerEvent.1
            @Override // p425j.p444e.InterfaceC11675i
            public void subscribe(InterfaceC11672h interfaceC11672h) throws Exception {
                try {
                    interfaceC11672h.mo10903f(ProducerEvent.this.produceEvent());
                    interfaceC11672h.mo10905a();
                } catch (InvocationTargetException e) {
                    ProducerEvent producerEvent = ProducerEvent.this;
                    producerEvent.throwRuntimeException("Producer " + ProducerEvent.this + " threw an exception.", e);
                }
            }
        }, EnumC11269a.BUFFER).m11187M(EventThread.getScheduler(this.thread));
    }

    @Override // com.hwangjr.rxbus.entity.Event
    public /* bridge */ /* synthetic */ void throwRuntimeException(String str, Throwable th) {
        super.throwRuntimeException(str, th);
    }

    public String toString() {
        return "[EventProducer " + this.method + "]";
    }

    @Override // com.hwangjr.rxbus.entity.Event
    public /* bridge */ /* synthetic */ void throwRuntimeException(String str, InvocationTargetException invocationTargetException) {
        super.throwRuntimeException(str, invocationTargetException);
    }
}
