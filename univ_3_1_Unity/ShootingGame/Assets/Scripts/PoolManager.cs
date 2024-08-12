using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PoolManager
{
    static Dictionary<int, List<GameObject>> dic = new Dictionary<int, List<GameObject>>();
    static GameObject folder;

    public static GameObject Spawn(GameObject obj, Vector3 pos, Quaternion rot)
    {
        if (folder == false)
        {
            folder = new GameObject("Pool");
            UnityEngine.GameObject.DontDestroyOnLoad(folder);
        }

        if (dic.ContainsKey(obj.GetInstanceID()) == false)
        {
            List<GameObject> list2 = new List<GameObject>();
            GameObject clone2 = Object.Instantiate(obj, pos, rot);
            clone2.transform.parent = folder.transform;
            list2.Add(clone2);
            dic.Add(obj.GetInstanceID(), list2);
            return clone2;
        }
        List<GameObject> list = dic[obj.GetInstanceID()];
        for (int i = 0; i < list.Count; i++)
        {
            if (list[i].activeSelf == false)
            {
                list[i].SetActive(true);
                list[i].transform.position = pos;
                list[i].transform.rotation = rot;
                return list[i];
            }
        }


        GameObject clone = Object.Instantiate(obj, pos, rot);
        clone.transform.parent = folder.transform;
        list.Add(clone);

        return clone;
    }

    public static void Despawn(GameObject obj)
    {
        obj.SetActive(false);
    }
}
