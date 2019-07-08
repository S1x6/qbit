package qbit.platform

actual class File {
    actual constructor(parent: File, child: String){
        TODO("not implemented yet")
    }
    actual constructor(parent: String){
        TODO("not implemented yet")
    }
    actual fun createNewFile(): Boolean{
        TODO("not implemented yet")
    }
    actual fun exists(): Boolean{
        TODO("not implemented yet")
    }
    actual fun mkdirs(): Boolean{
        TODO("not implemented yet")
    }
    actual fun mkdir(): Boolean{
        TODO("not implemented yet")
    }
    actual fun isFile(): Boolean{
        TODO("not implemented yet")
    }
    actual fun isDirectory(): Boolean{
        TODO("not implemented yet")
    }
    actual fun getName(): String{
        TODO("not implemented yet")
    }
    actual fun getAbsolutePath(): String{
        TODO("not implemented yet")
    }
    actual fun listFiles(): Array<File>{
        TODO("not implemented yet")
    }
}

actual object Files {
    actual fun createTempDirectory(prefix: String): Path{
        TODO("not implemented yet")
    }
}

actual fun File.listFiles(action: ((File) -> Boolean)): Array<File>?{
    TODO("not implemented yet")
}
actual fun File.forEachLine(action: (line: String) -> Unit){
    TODO("not implemented yet")
}
actual fun File.resolve(relative: File): File{
    TODO("not implemented yet")
}
actual fun File.resolve(relative: String): File{
    TODO("not implemented yet")
}
actual fun File.readBytes(): ByteArray?{
    TODO("not implemented yet")
}
actual fun File.deleteRecursively(): Boolean{
    TODO("not implemented yet")
}

actual interface Path

actual class FileDescriptor {
    actual fun sync(){
        TODO("not implemented yet")
    }
}