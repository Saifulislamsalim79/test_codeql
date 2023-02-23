package com.hwangjr.rxbus.finder;

import com.hwangjr.rxbus.entity.EventType;
import com.hwangjr.rxbus.entity.ProducerEvent;
import com.hwangjr.rxbus.entity.SubscriberEvent;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public interface Finder {
    public static final Finder ANNOTATED = new Finder() { // from class: com.hwangjr.rxbus.finder.Finder.1
        @Override // com.hwangjr.rxbus.finder.Finder
        public Map<EventType, ProducerEvent> findAllProducers(Object obj) {
            return AnnotatedFinder.findAllProducers(obj);
        }

        @Override // com.hwangjr.rxbus.finder.Finder
        public Map<EventType, Set<SubscriberEvent>> findAllSubscribers(Object obj) {
            return AnnotatedFinder.findAllSubscribers(obj);
        }
    };

    Map<EventType, ProducerEvent> findAllProducers(Object obj);

    Map<EventType, Set<SubscriberEvent>> findAllSubscribers(Object obj);
}
