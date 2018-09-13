package core.mapper

interface Mapper<I, O> {
    fun mapFrom(param: I): O
    fun mapTo(param: O): I
}