package io.intercom.android.sdk.models;

import io.intercom.android.sdk.utilities.NullSafety;
/* loaded from: classes3.dex */
public abstract class OperatorClientCondition {

    /* loaded from: classes3.dex */
    public static final class Builder {
        String condition_id;

        /* renamed from: id */
        String f23911id;

        public OperatorClientCondition build() {
            return OperatorClientCondition.create(NullSafety.valueOrEmpty(this.f23911id), NullSafety.valueOrEmpty(this.condition_id));
        }
    }

    public static OperatorClientCondition create(String str, String str2) {
        return new AutoValue_OperatorClientCondition(str, str2);
    }

    public abstract String conditionId();

    /* renamed from: id */
    public abstract String mo13072id();
}
