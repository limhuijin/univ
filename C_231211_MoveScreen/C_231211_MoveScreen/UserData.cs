using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C_231211_MoveScreen
{
    [Serializable] // 이걸 안하면 클래스 저장이 안된다(?) 다행히 이거까진 시험범위 x
    public class UserData
    {
        public string name;
        public int number;
        public UserData()
        {
            this.name = "player";
            number = 0;
        }
    }
}
