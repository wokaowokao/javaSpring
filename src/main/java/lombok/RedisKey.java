package lombok;

public enum RedisKey {
    uniuser_session_("uniuser_session_"),
    uniuser_session_union_("uniuser_session_union_"),
    uniuser_verify_("uniuser_verify_"),
    ;


    private String prefix;

    RedisKey(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
