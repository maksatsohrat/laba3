class Samsung{
    private var samsungname: String = ""
    private var samsungmodel: String = ""
    private var samsungcolor: String = ""
    private var samsungfrom: String = ""
    private var samsungmemory: Int = 0
    private var samsungozu: Int = 0
    private var samsungversion: Int = 0

    constructor(name: String, model: String, color: String, from: String, memory: Int, ozu: Int, version: Int){
        this.samsungname = name
        this.samsungmodel = model
        this.samsungcolor = color
        this.samsungfrom = from
        this.samsungmemory = memory
        this.samsungozu = ozu
        this.samsungversion = version
    }

    fun getName():String{ return samsungname}
    fun getModel():String{ return samsungmodel}
    fun getColor():String{ return samsungcolor}
    fun getFrom():String{ return samsungfrom}
    fun getMemory():Int{ return samsungmemory}
    fun getOzu():Int{ return samsungozu}
    fun getVersion():Int{ return samsungversion}

    fun setName(name:String){ samsungname = name}
    fun setModel(model:String){samsungmodel = model}
    fun setColor(color:String){ samsungcolor = color}
    fun setFrom(from:String){ samsungfrom = from}
    fun setMemory(memory:Int){ samsungmemory = memory}
    fun setOzu(ozu:Int){ samsungozu = ozu}
    fun setVersion(version:Int){ samsungversion = version}


    fun printAllInfo(){
        print("Name: ${samsungname}\nModel: $samsungmodel\nColor: $samsungcolor\nFrom: $samsungfrom\nMemory: $samsungmemory\nOzu: $samsungozu\nVersion: $samsungversion\n")
    }
    fun power():Int {
        var res = samsungozu * samsungmemory
        return res
    }
    fun battery():Int {
        var ress = samsungozu * samsungmemory * samsungversion
        return ress
    }

    fun isOverozu(): Boolean{ if((samsungmemory == 256)) {return true} else{ return false}}

}
fun main(args: Array<String>) {
    val samsung1 = Samsung("GalaxyS", "A51", "white", "made in china", 64, 6, 10)
    val samsung2 = Samsung("GalaxM", "A71", "black", "made in korea", 128, 8, 11)
    val samsung3 = Samsung("GalaxyFE", "A72", "blue", "made in china", 256, 12, 12)

    samsung1.printAllInfo()
        if (samsung2.isOverozu()) {
            System.out.println("Память телефона 256")
            System.out.println("Производительность телефона" + samsung3.getName()+ "=" + (samsung3.power()).toString())
        }
    }
