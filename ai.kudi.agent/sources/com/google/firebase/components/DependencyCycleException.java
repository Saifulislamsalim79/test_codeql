package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {
    public DependencyCycleException(List<C5296n<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
    }
}
