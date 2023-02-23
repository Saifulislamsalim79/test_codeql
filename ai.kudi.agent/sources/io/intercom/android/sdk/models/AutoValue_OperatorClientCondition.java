package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_OperatorClientCondition extends OperatorClientCondition {
    private final String conditionId;

    /* renamed from: id */
    private final String f23904id;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_OperatorClientCondition(String str, String str2) {
        if (str != null) {
            this.f23904id = str;
            if (str2 != null) {
                this.conditionId = str2;
                return;
            }
            throw new NullPointerException("Null conditionId");
        }
        throw new NullPointerException("Null id");
    }

    @Override // io.intercom.android.sdk.models.OperatorClientCondition
    public String conditionId() {
        return this.conditionId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OperatorClientCondition) {
            OperatorClientCondition operatorClientCondition = (OperatorClientCondition) obj;
            return this.f23904id.equals(operatorClientCondition.mo13072id()) && this.conditionId.equals(operatorClientCondition.conditionId());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23904id.hashCode() ^ 1000003) * 1000003) ^ this.conditionId.hashCode();
    }

    @Override // io.intercom.android.sdk.models.OperatorClientCondition
    /* renamed from: id */
    public String mo13072id() {
        return this.f23904id;
    }

    public String toString() {
        return "OperatorClientCondition{id=" + this.f23904id + ", conditionId=" + this.conditionId + "}";
    }
}
